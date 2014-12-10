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
                        os.system("subl " + sfile)

SUBLIME = r'C:\Program Files\SublimeText2\sublime_text.exe'
if not os.path.exists(SUBLIME):
    SUBLIME = "subl"

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


if __name__ == '__main__':
    findUnusedAtomicTest()
