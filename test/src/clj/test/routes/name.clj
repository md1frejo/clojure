(ns test.routes.name
  (:require
    [ctmx.core :as ctmx]
    [test.response :as response]))

(ctmx/defcomponent ^:endpoint hello [req my-name]
  [:div#hello "hello " my-name])

(defn routes []
  (ctmx/make-routes "/name"
                    (fn [req]
                      (response/html5-response
                       [:div
                        [:label "what is your name?"]
                        [:input {:name "my-name" :hx-patch "hello" :hx-target "#hello"}]
                        (hello req "")]))))
