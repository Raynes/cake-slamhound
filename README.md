# cake-slamhound

This is a simple little plugin adding [Slamhound](http://github.com/technomancy/slamhound) support to cake. It provides a single task, `slamhound`, that you can pass a path to a file to.

Slamhound is a tool for reconstructing `(ns ..)` declarations. It's pretty fun.

# Installing

Edit your project.clj file and add this `:cake-plugins [[cake-slamhound "0.0.1"]]`.
