import collections

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



# class SuccessfullyRun(collections.MutableMapping):
#     def __init__(self):
#         if os.path.exists(SUCCEEDED):
#             self.store = eval(file(SUCCEEDED).read())
#             print("read from file")
#         else:
#             self.store = dict()
#             print("Created new")
#         print("now is: " + pprint.pformat(self.store))

#     def __getitem__(self, key):
#         if self.store.has_key(key):
#             return self.store[key]
#         return None

#     def update(self):
#         with file(SUCCEEDED, 'w') as succ:
#             succ.write(pprint.pformat(self.store))

#     def __setitem__(self, key, value):
#         self.store[key] = value
#         self.update()

#     def __delitem__(self, key):
#         del self.store[key]
#         self.update()

#     def __iter__(self):
#         return iter(self.store)

#     def __len__(self):
#         return len(self.store)

#     def __repr__(self):
#         return repr(self.store)

#     def keys(self):
#         return self.store.keys()

#     def values(self):
#         return self.store.values()

#     def __cmp__(self, dict):
#         return cmp(self.store, dict)

#     def __contains__(self, item):
#         return item in self.store

#     def add(self, key, value):
#         self.store[key] = value
#         self.update()

#     def __call__(self):
#         return self.store

#     def __unicode__(self):
#         return unicode(repr(self.store))
from collections import defaultdict
class SuccessfullyRun(defaultdict):
    def __init__(self, *args, **kwargs):
        defaultdict.__init__(self, dict)
    # def __init__(self):
    #     if os.path.exists(SUCCEEDED):
    #         self.store = eval(file(SUCCEEDED).read())
    #         print("read from file")
    #     else:
    #         self.store = collections.defaultDict(dict)
    #         print("Created new")
    #     print("now is: " + pprint.pformat(self.store))

    # def __getitem__(self, key):
    #     # if self.store.has_key(key):
    #     return self.store[key]
    #     # return None

    # def update(self):
    #     with file(SUCCEEDED, 'w') as succ:
    #         succ.write(pprint.pformat(repr(self.store))

    # def __setitem__(self, key, value):
    #     self.store[key] = value
    #     self.update()

    # def __delitem__(self, key):
    #     del self.store[key]
    #     self.update()

    # def __iter__(self):
    #     return iter(self.store)

    # def __len__(self):
    #     return len(self.store)

    # def __repr__(self):
    #     return repr(self.store)

    # def keys(self):
    #     return self.store.keys()

    # def values(self):
    #     return self.store.values()

    # def __cmp__(self, dict):
    #     return cmp(self.store, dict)

    # def __contains__(self, item):
    #     return item in self.store

    # def add(self, key, value):
    #     self.store[key] = value
    #     self.update()

    # def __call__(self):
    #     return self.store

    # def __unicode__(self):
    #     return unicode(repr(self.store))
