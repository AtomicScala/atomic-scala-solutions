# Solution directories in the order the chapters appear in the book

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
from glob import glob

@contextmanager
def visitDir(d):
    old = os.getcwd()
    os.chdir(d)
    yield d
    os.chdir(old)

if __name__ == '__main__':
    from pprint import pprint
    start = solutionDirs.index("Methods")
    stop = solutionDirs.index("Brevity")
    for tdir in solutionDirs[start:stop]:
        with visitDir(tdir):
            print tdir
            print '=' * len(tdir)
            for sfile in glob("*.scala"):
                msg = sfile + ": "
                lines = open(sfile).readlines()
                for ln in lines:
                    if "def " in ln and '{' not in ln:
                        if msg:
                            print msg
                            msg = None
                        print ln

