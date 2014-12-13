# Example & Solution directories in the order the chapters appear in the book

solutionDirs = [
    "Values",
    "DataTypes",
    "Variables",
    "Expressions",
    "ConditionalExpressions",
    "EvaluationOrder",
    "CompoundExpressions",
    "Summary1",
    "Methods",
    "ClassesAndObjects",
    "CreatingClasses",
    "MethodsInsideClasses",
    'ImportsAndPackages-1stEdition',
    'ImportsAndPackages-2ndEdition',
    "Testing",
    "Fields",
    "ForLoops",
    "Vectors",
    "MoreConditionals",
    "Summary2",
    "PatternMatching",
    "ClassArguments",
    "NamedAndDefaultArguments",
    "Overloading",
    "Constructors",
    "AuxiliaryConstructors",
    "ClassExercises",
    "CaseClasses",
    "StringInterpolation",
    "ParameterizedTypes",
    "FunctionsasObjects",
    "mapAndreduce",
    "Comprehensions",
    "PatternMatchingwithTypes",
    "PatternMatchingwithCaseClasses",
    "Brevity",
    "ABitofStyle",
    "IdiomaticScala",
    "DefiningOperators",
    "AutomaticStringConversion",
    "Tuples",
    "CompanionObjects",
    "Inheritance",
    "BaseClassInitialization",
    "OverridingMethods",
    "Enumerations",
    "AbstractClasses",
    "Traits",
    "UniformAccessAndSetters",
    "ReachingintoJava",
    "Applications",
    "ALittleReflection",
    "Polymorphism",
    "Composition",
    "UsingTraits",
    "TaggingTraitsAndCaseObjects",
    "TypeParameterConstraints",
    "BuildingSystemswithTraits",
    "Sequences",
    "ListsAndRecursion",
    "CombiningSequenceswithzip",
    "Sets",
    "Maps",
    "ReferencesAndMutability",
    "PatternMatchingwithTuples",
    "ErrorHandlingwithExceptions",
    "ConstructorsAndExceptions",
    "ErrorReportingwithEither",
    "HandlingNon-ValueswithOption",
    "ConvertingExceptionswithTry",
    "CustomErrorReporting",
    "DesignbyContract",
    "Logging",
    "ExtensionMethods",
    "ExtensibleSystemswithTypeClasses",
]

import os, inspect, sys

# Directory where runner.bat lives:
HOME_DIR = os.path.dirname(os.path.abspath(inspect.getfile(inspect.currentframe())))
ROOT_DIR = os.path.dirname(HOME_DIR)

def findmissing():
    import glob, pprint
    paths = [p[:-1] for p in glob.glob('*/')]
    pprint.pprint(set(paths).symmetric_difference(set(solutionDirs)))

from contextlib import contextmanager
import os

@contextmanager
def visitDir(d):
    old = os.getcwd()
    os.chdir(d)
    yield d
    os.chdir(old)

def findUnbracedMethods():
    from pprint import pprint
    from glob import glob
    import subprocess, re
    start = solutionDirs.index("Methods")
    stop = solutionDirs.index("Brevity")
    for tdir in solutionDirs[start:stop]:
        dirmsg = tdir + "\n" + '=' * len(tdir)
        with visitDir(tdir):
            for sfile in glob("*.scala"):
                msg = sfile + ": "
                lines = open(sfile).readlines()
                for ln in lines:
                    if "def " in ln and '{' not in ln:
                        if dirmsg:
                            print dirmsg
                            dirmsg = None
                        if msg:
                            print msg
                            msg = None
                        print ln
                        subprocess.call([SUBLIME, sfile])

SUBLIME = r'C:\Program Files\SublimeText2\sublime_text.exe'
if not os.path.exists(SUBLIME):
    SUBLIME = r"C:\Program Files\Sublime Text 3\sublime_text.exe"

def findUnusedAtomicTest():
    from glob import glob
    import subprocess, re
    for tdir in solutionDirs:
        with visitDir(tdir):
            for sfile in glob("*.scala"):
                original = open(sfile).read()
                code = re.sub("//.*", "", original)
                multiline_comment = re.compile(r'/\*(.*?)\*/', re.DOTALL)
                code = multiline_comment.sub("", code)
                if  "import com.atomicscala.AtomicTest" in code and \
                    " is " not in code and \
                    " is\n" not in code and \
                    "needs solution" not in original and \
                    '''assert("Solution" == "Incomplete")''' not in code:
                    subprocess.call([SUBLIME, sfile])


def findMethodsWithoutReturnTypes():
    from pprint import pprint
    from glob import glob
    import subprocess, re
    start = solutionDirs.index("Methods")
    stop = solutionDirs.index("Brevity")
    for tdir in solutionDirs[start:stop]:
        dirmsg = tdir + "\n" + '=' * len(tdir)
        with visitDir(tdir):
            for sfile in glob("*.scala"):
                msg = sfile + ": "
                lines = open(sfile).readlines()
                for ln in lines:
                    if "def " in ln and \
                        '):' not in ln and \
                        "this(" not in ln:
                        if dirmsg:
                            print dirmsg
                            dirmsg = None
                        if msg:
                            print msg
                            msg = None
                        print ln
                        subprocess.call([SUBLIME, sfile])


output_should_be = """
/* OUTPUT_SHOULD_BE

*/
"""

def addOutputShouldBeToSolutions():
    from glob import glob
    import subprocess, re
    for tdir in solutionDirs:
        dirmsg = tdir + "\n" + '=' * len(tdir)
        with visitDir(os.path.join(ROOT_DIR, tdir)):
            for sfile in glob("Solution-*.scala"):
                msg = sfile
                with open(sfile) as f:
                    solution = f.read()
                if "OUTPUT_SHOULD" not in solution:
                    if dirmsg:
                        print dirmsg
                        dirmsg = None
                    if msg:
                        print msg
                        msg = None
                    with open(sfile, 'w') as f:
                        f.write(solution + output_should_be)
                    subprocess.call([SUBLIME, sfile])


if __name__ == '__main__':
    addOutputShouldBeToSolutions()
