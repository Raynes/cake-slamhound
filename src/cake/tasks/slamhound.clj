(ns cake.tasks.slamhound
  (:use [cake.core :only [deftask]]
        [cake :only [*pwd*]]
        [cake.file :only [file]]
        [slam.hound :only [reconstruct]]))

(deftask slamhound
  "Rips your ns form apart and reconstructs it."
  "Pass a file and slamhound will read your ns form and your code and
  try to determine what the ns form should look like."
  {[filename] :slamhound}
  (println (reconstruct (file *pwd* filename))))
