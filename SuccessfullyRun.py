from collections import defaultdict
from pprint import pprint, pformat
import os
import pickle

TRACE = "trace.tst"
class SuccessfullyRun(defaultdict):

    def __init__(self):
        defaultdict.__init__(self, dict)
        if os.path.exists(TRACE):
            with file(TRACE, "rb") as f:
                self = pickle.load(f)
                print("read in:")
                pprint(self)

    def __setitem__(self, key, val):
        defaultdict.__setitem__(self, key, val)
        with file(TRACE, 'wb') as f:
            pickle.dump(self, f)


if __name__ == '__main__':
    sr = SuccessfullyRun()
    sr['foo']['bar'] = True
    sr['foo']['baz'] = True
    sr['bingo']['bar'] = True
    sr['bingo']['baz'] = True
    pprint(sr)
    print sr['foo']['baz']
    print repr(sr)

