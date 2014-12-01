@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
#start python code here (tested on Python 2.7.4)
import os, sys

def clean():
    for x in [os.path.join(d[0], f) for d in os.walk(".") for f in d[2] if f.endswith("-x.txt")]:
        os.remove(".\\" + x)
    #sys.exit()

clean()

scalaFiles = [os.path.join(d[0], f) for d in os.walk(".")
             for f in d[2] if f.endswith(".scala")]
for r in scalaFiles:
    print(r)
    with file(r) as fl: # Auto-close
        sf = fl.readlines()
    for i, line in enumerate(sf):
        sf[i] = line.rstrip() + "\n"
    while not sf[-1].rstrip():
        del sf[-1]
        print "@"
    #file(".\\" + r.rsplit(".")[1] + "-x.txt", 'w').writelines(sf)
    file(".\\" + r, 'w').writelines(sf)