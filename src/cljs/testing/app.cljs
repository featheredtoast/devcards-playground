(ns testing.app
  (:require [reagent.core :as reagent :refer [atom]]
            [devcards.core])
  (:require-macros
     ;; Notice that I am not including the 'devcards.core namespace
     ;; but only the macros. This helps ensure that devcards will only
     ;; be created when the :devcards is set to true in the build config.
     [devcards.core :as dc :refer [defcard defcard-rg defcard-doc]]))
(defonce app-state (atom {:text "Hello Chestnut!"}))
(defn greeting []
  [:h1 (:text @app-state)])

(defcard-doc
  "this is a documentation thing")

(defcard "a card")
(defcard reagent-no-help
  (reagent/as-element [:h1 "Reagent example"]))
(defcard-rg main-page
  (greeting))
