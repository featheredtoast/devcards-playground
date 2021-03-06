(ns testing.core
  (:require [reagent.core :as reagent :refer [atom]]
            [testing.app]
            [devcards.core])
  (:require-macros
     ;; Notice that I am not including the 'devcards.core namespace
     ;; but only the macros. This helps ensure that devcards will only
     ;; be created when the :devcards is set to true in the build config.
     [devcards.core :as dc :refer [defcard defcard-rg defcard-doc]]))

(enable-console-print!)

(defn greeting []
  [:h1 (:text @testing.cards/app-state)])

(defn main [] (reagent/render [greeting] (js/document.getElementById "app")))
(main)
