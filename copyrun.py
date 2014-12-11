from solutionDirs import solutionDirs
import shutil
for dirname in solutionDirs:
    shutil.copy("run.bat", dirname)
