import sublime, sublime_plugin

class AutoSaveCommand(sublime_plugin.EventListener):
    def on_modified(self, view):  
        if view.file_name():
            view.run_command('save')