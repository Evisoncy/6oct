(deftemplate categoria-riesgo
	(slot prob)
	(slot impacto)
)

(deftemplate recomendacion
	(slot mensaje)
)

(defrule rule1-0
	(categoria-riesgo
		(prob frecuente)
		(impacto catastrofico))
	=>	(printout t crlf "La categoria del riesgo es EXTREMADAMENTE ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es EXTREMADAMENTE ALTO")))
)

(defrule rule1-1
	(categoria-riesgo
		(prob frecuente)
		(impacto critico))
	=>	(printout t crlf "La categoria del riesgo es EXTREMADAMENTE ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es EXTREMADAMENTE ALTO")))
)

(defrule rule1-2
	(categoria-riesgo
		(prob frecuente)
		(impacto marginal))
	=>	(printout t crlf "La categoria del riesgo es ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es ALTO")))
)

(defrule rule1-3
	(categoria-riesgo
		(prob frecuente)
		(impacto insignificante))
	=>	(printout t crlf "La categoria del riesgo es MODERADO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es MODERADO")))
)

(defrule rule2-0
	(categoria-riesgo
		(prob probable)
		(impacto catastrofico))
	=>	(printout t crlf "La categoria del riesgo es EXTREMADAMENTE ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es EXTREMADAMENTE ALTO")))
)

(defrule rule2-1
	(categoria-riesgo
		(prob probable)
		(impacto critico))
	=>	(printout t crlf "La categoria del riesgo es ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es ALTO")))
)

(defrule rule2-2
	(categoria-riesgo
		(prob probable)
		(impacto marginal))
	=>	(printout t crlf "La categoria del riesgo es MODERADO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es MODERADO")))
)

(defrule rule2-3
	(categoria-riesgo
		(prob probable)
		(impacto insignificante))
	=>	(printout t crlf "La categoria del riesgo es BAJO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es BAJO")))
)

(defrule rule3-0
	(categoria-riesgo
		(prob ocasional)
		(impacto catastrofico))
	=>	(printout t crlf "La categoria del riesgo es ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es ALTO")))
)

(defrule rule3-1
	(categoria-riesgo
		(prob ocasional)
		(impacto critico))
	=>	(printout t crlf "La categoria del riesgo es ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es ALTO")))
)

(defrule rule3-2
	(categoria-riesgo
		(prob ocasional)
		(impacto marginal))
	=>	(printout t crlf "La categoria del riesgo es MODERADO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es MODERADO")))
)

(defrule rule3-3
	(categoria-riesgo
		(prob ocasional)
		(impacto insignificante))
	=>	(printout t crlf "La categoria del riesgo es BAJO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es BAJO")))
)

(defrule rule4-0
	(categoria-riesgo
		(prob rara-vez)
		(impacto catastrofico))
	=>	(printout t crlf "La categoria del riesgo es ALTO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es ALTO")))
)

(defrule rule4-1
	(categoria-riesgo
		(prob rara-vez)
		(impacto critico))
	=>	(printout t crlf "La categoria del riesgo es MODERADO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es MODERADO")))
)

(defrule rule4-2
	(categoria-riesgo
		(prob rara-vez)
		(impacto marginal))
	=>	(printout t crlf "La categoria del riesgo es BAJO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es BAJO")))
)

(defrule rule4-3
	(categoria-riesgo
		(prob rara-vez)
		(impacto insignificante))
	=>	(printout t crlf "La categoria del riesgo es BAJO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es BAJO")))
)

(defrule rule5-0
	(categoria-riesgo
		(prob improbable)
		(impacto catastrofico))
	=>	(printout t crlf "La categoria del riesgo es MODERADO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es MODERADO")))
)

(defrule rule5-1
	(categoria-riesgo
		(prob improbable)
		(impacto critico))
	=>	(printout t crlf "La categoria del riesgo es BAJO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es BAJO")))
)

(defrule rule5-2
	(categoria-riesgo
		(prob improbable)
		(impacto marginal))
	=>	(printout t crlf "La categoria del riesgo es BAJO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es BAJO")))
)

(defrule rule5-3
	(categoria-riesgo
		(prob improbable)
		(impacto insignificante))
	=>	(printout t crlf "La categoria del riesgo es BAJO" crlf)
		(assert (recomendacion (mensaje "La categoria del riesgo es BAJO")))
)





