from collections import defaultdict
from pprint import pprint, pformat
import os
import pickle

TRACE = "trace.tst"
class SuccessfullyRun(object):

    def __init__(self):
        if os.path.exists(TRACE):
            with file(TRACE) as f:
                self.map = eval(f.read())
        else:
            self.map = defaultdict(set)

    def contains(self, directory, filename):
        if self.map.has_key(directory):
            return filename in self.map[directory]
        else:
            return False

    def add(self, directory, filename):
        self.map[directory].add(filename)
        with file(TRACE, 'w') as f:
            f.write(repr(self.map).replace("<type 'set'>", 'set'))

    def __repr__(self):
        return repr(self.map.items())


if __name__ == '__main__':
    sr = SuccessfullyRun()
    pprint(sr)
    sr.add('foo','bar')
    sr.add('foo','baz')
    sr.add('bingo', 'bar')
    sr.add('bingo', 'baz')
    pprint(sr)
    print sr.contains('foo', 'baz')
    sr.add('foo','baz')
    pprint(sr)
    print sr.contains('foo', 'baz')
