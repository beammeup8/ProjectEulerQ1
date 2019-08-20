(define sum_mult_3_5
  (lambda (num)
    (if (<= num 0)
      0
      (let ((a (- num 1)))
        (if (or (= (modulo a 3) 0) (= (modulo a 5) 0))
          (+ a (sum_mult_3_5 a))
          (sum_mult_3_5 a))))))