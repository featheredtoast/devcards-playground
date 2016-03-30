(ns testing.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [testing.core-test]))

(enable-console-print!)

(doo-tests 'testing.core-test)
