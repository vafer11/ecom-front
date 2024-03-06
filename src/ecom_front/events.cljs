(ns ecom-front.events
  (:require
   [re-frame.core :as re-frame]
   [ecom-front.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
