@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
#start python code here (tested on Python 2.7.4)
import os, re, sys, msvcrt

scalaFiles = [os.path.join(d[0], f) for d in os.walk(".")
             for f in d[2] if f.endswith(".scala")]

for r in scalaFiles:
    with file(r) as fl: # Auto-close
        sf = fl.readlines()
    for i, line in enumerate(sf):
        def showReplace(str):
            if str in sf[i] and '"' not in sf[i] and not sf[i].strip().startswith("//"):
                os.system("cls")
                print(r)
                print
                print sf[i]
                print("Change it? (y/n/q) ")
                choice = msvcrt.getch()
                if choice == 'q':
                    sys.exit()
                if choice == "y":
                    sf[i] = sf[i].replace(str, ":")
                    print
                    print sf[i]
                    print("OK? (any key or 'q') ")
                    choice = msvcrt.getch()
                    if choice == 'q':
                        sys.exit()
        showReplace(": ")
        showReplace(" :")
    file(".\\" + r, 'w').writelines(sf)