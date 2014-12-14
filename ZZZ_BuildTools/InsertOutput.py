# Sublime Text plugin to insert output in the OUTPUT_SHOULD_BE comment
# Bind to key with:
# { "keys": ["f12"], "command": "insert_output" },
import sublime, sublime_plugin, pprint, os, re

class InsertOutputCommand(sublime_plugin.TextCommand):

	def show(self, edit, msg):
		self.view.insert(edit, self.view.size(), str(msg) + "\n")

	def pformat(self, edit, thing):
		self.view.insert(edit, self.view.size(), pprint.pformat(thing))

	def run(self, edit):
		#self.pformat(edit, dir(self.view))
		outfile = self.view.file_name().rsplit('.')[0] + ".out"
		if not os.path.exists(outfile):
			sublime.error_message("Not Found: " + outfile)
			return
		out_data = open(outfile).read().strip()
		region = self.view.find(r"/\* OUTPUT_SHOULD_BE\n", 0)
		if region:
			self.view.insert(edit, region.end(), out_data)
		else:
			sublime.error_message("Not Found: OUTPUT_SHOULD_BE")
