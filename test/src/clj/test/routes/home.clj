(ns test.routes.home
  (:require
    [ctmx.core :as ctmx]
    [test.response :as response]))

(ctmx/defcomponent ^:endpoint root [req ^:int num-clicks]
  [:div.m-3 {:hx-post "root"
             :hx-swap "outerHTML"
             :hx-vals {:num-clicks (inc num-clicks)}}
   "You have clicked me " num-clicks " times."])

(defn home-routes []
  (ctmx/make-routes
   "/"
   (fn [req]
     (response/html5-response
      (root req 0)))))

