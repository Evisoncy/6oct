(deftemplate recurso-tarea
	(slot recurso1)
	(slot recurso2)
	(slot recurso3)
	(multislot recurso4))
	
(deftemplate recomendacion
	(slot mensaje))

(defrule recurso1-0
	(recurso-tarea
		(recurso1 cero)
		(recurso2 cero)
		(recurso3 cero)
		(recurso4 cero))
	=>
		(printout t crlf "RECURSOS INSUFICIENTES. Es necesario minimo 3 de recurso 1, y 1 de recurso2, recurso3,recurso4" crlf crlf)
		(assert (recomendacion (mensaje "RECURSOS INSUFICIENTES. Es necesario minimo 3 de recurso 1, y 1 de recurso2, recurso3,recurso4")))
)	

(defrule recurso1-1
	(recurso-tarea
		(recurso1 uno)
		(recurso2 cero)
		(recurso3 cero)
		(recurso4 cero))
	=>
		(printout t crlf "RECURSOS INSUFICIENTES. Es necesario minimo 2 de recurso 1, y 1 de recurso2, recurso3,recurso4" crlf crlf)
		(assert (recomendacion (mensaje "RECURSOS INSUFICIENTES. Es necesario minimo 2 de recurso 1, y 1 de recurso2, recurso3,recurso4")))
)	

(defrule recurso1-2
	(recurso-tarea
		(recurso1 dos)
		(recurso2 cero)
		(recurso3 cero)
		(recurso4 cero))
	=>
		(printout t crlf "RECURSOS INSUFICIENTES. Es necesario minimo 1 de recurso 1, y 1 de recurso2, recurso3,recurso4" crlf crlf)
		(assert (recomendacion (mensaje "RECURSOS INSUFICIENTES. Es necesario minimo 1 de recurso 1, y 1 de recurso2, recurso3,recurso4")))
)

(defrule recurso1-3
	(recurso-tarea
		(recurso1 tres)
		(recurso2 cero)
		(recurso3 cero)
		(recurso4 cero))
	=>
		(printout t crlf "RECURSOS INSUFICIENTES. Es necesario minimo 1 de recurso2, recurso3,recurso4" crlf crlf)
		(assert (recomendacion (mensaje "RECURSOS INSUFICIENTES. Es necesario minimo 1 de recurso2, recurso3,recurso4")))
)

(defrule recurso1-4
	(recurso-tarea
		(recurso1 tres)
		(recurso2 uno)
		(recurso3 uno)
		(recurso4 uno))
	=>
		(printout t crlf "RECURSOS SUFICIENTES." crlf crlf)
		(assert (recomendacion (mensaje "RECURSOS SUFICIENTES. ")))
)

(defrule recurso1-5
	(recurso-tarea
		(recurso1 tres)
		(recurso2 uno)
		(recurso3 uno)
		(recurso4 cero))
	=>
		(printout t crlf "RECURSOS INSUFICIENTES. Es necesario minimo 1 unidad del recurso4" crlf crlf)
		(assert (recomendacion (mensaje "RECURSOS INSUFICIENTES. Es necesario minimo 1 unidad del recurso4")))
)





		
		