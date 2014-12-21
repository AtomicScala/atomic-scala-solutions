# Bind to key with:
# { "keys": ["f11"], "command": "format_code_for_exercise" },
import sublime, sublime_plugin, pprint, os, re

class FormatCodeForExerciseCommand(sublime_plugin.TextCommand):

	def run(self, edit):
		for region in self.view.sel():
			code = self.view.substr(region).replace("\n", "\r")
			sublime.set_clipboard(code)
			sublime.message_dialog(code)

