(ns clj-abnf.rfc.rfc4647
  (:require [clj-abnf.core :as abnf]))

(def rules-text "
language-range   = (1*8ALPHA *(\"-\" 1*8alphanum)) / \"*\"
alphanum         = ALPHA / DIGIT

extended-language-range = (1*8ALPHA / \"*\") *(\"-\" (1*8alphanum / \"*\"))
")

(def rules
  (abnf/compile-rules-text rules-text))
