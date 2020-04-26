;; funTrue
;; receives two values A and B
;; returns first value
(defn funTrue [x] (defn f3 [y] x))

;; funFalse
;; receives two values A and B
;; returns second value
(defn funFalse [x] (defn f4 [y] y))

;; toBoolean 
;; receives funTrue or funFalse and
;; returns true if funTrue was received
;; returns false if funFalse was received
(defn toBoolean [f] ((f true) false))

;; funNot
;; receives funTrue or funFalse
;; if input is funFalse returns true
;; if input is funTrue returns true
(defn funNot [x] ((x false) true))

;; funAnd
;; receives two inputs which can take values: funTrue or funFalse
;; if input is funTrue,funTrue then true is returned
;; otherwise returns false
(defn funAnd [x] (defn f1 [y] ((y ((x true) false)) false)))

;; funOr
;; receives two inputs which can take values: funTrue or funFalse
;; if input is funFalse,funFalse then false is returned
;; otherwise returns true
(defn funOr [x] (defn f1 [y] ( (y true) ((x true) false) ) ))

;; funXOR
;; receives two inputs which can take values: funTrue or funFalse
;; if inputs differ then true is returned
;; otherwise returns false
(defn aux1 [f] ((f false) true) )
(defn aux2 [f] ((f true) false) )

(defn funXOR [x] (defn f1 [y]  ((y (aux1 x)) (aux2 x))  ))
