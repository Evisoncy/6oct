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
	=>	(printout t crlf "Extremadamente Alto" crlf)
		(assert (recomendacion (mensaje "Extremadamente Alto")))
)

(defrule rule1-1
	(categoria-riesgo
		(prob frecuente)
		(impacto critico))
	=>	(printout t crlf "Extremadamente Alto" crlf)
		(assert (recomendacion (mensaje "Extremadamente Alto")))
)

(defrule rule1-2
	(categoria-riesgo
		(prob frecuente)
		(impacto marginal))
	=>	(printout t crlf "Alto" crlf)
		(assert (recomendacion (mensaje "Alto")))
)

(defrule rule1-3
	(categoria-riesgo
		(prob frecuente)
		(impacto insignificante))
	=>	(printout t crlf "Moderado" crlf)
		(assert (recomendacion (mensaje "Moderado")))
)

(defrule rule2-0
	(categoria-riesgo
		(prob probable)
		(impacto catastrofico))
	=>	(printout t crlf "Extremadamente Alto" crlf)
		(assert (recomendacion (mensaje "Extremadamente Alto")))
)

(defrule rule2-1
	(categoria-riesgo
		(prob probable)
		(impacto critico))
	=>	(printout t crlf "Alto" crlf)
		(assert (recomendacion (mensaje "Alto")))
)

(defrule rule2-2
	(categoria-riesgo
		(prob probable)
		(impacto marginal))
	=>	(printout t crlf "Moderado" crlf)
		(assert (recomendacion (mensaje "Moderado" )))
)

(defrule rule2-3
	(categoria-riesgo
		(prob probable)
		(impacto insignificante))
	=>	(printout t crlf "Bajo" crlf)
		(assert (recomendacion (mensaje "Bajo")))
)

(defrule rule3-0
	(categoria-riesgo
		(prob ocasional)
		(impacto catastrofico))
	=>	(printout t crlf "Alto" crlf)
		(assert (recomendacion (mensaje "Alto")))
)

(defrule rule3-1
	(categoria-riesgo
		(prob ocasional)
		(impacto critico))
	=>	(printout t crlf "Alto" crlf)
		(assert (recomendacion (mensaje "Alto")))
)

(defrule rule3-2
	(categoria-riesgo
		(prob ocasional)
		(impacto marginal))
	=>	(printout t crlf "Moderado" crlf)
		(assert (recomendacion (mensaje "Moderado")))
)

(defrule rule3-3
	(categoria-riesgo
		(prob ocasional)
		(impacto insignificante))
	=>	(printout t crlf "Bajo" crlf)
		(assert (recomendacion (mensaje "Bajo")))
)

(defrule rule4-0
	(categoria-riesgo
		(prob rara-vez)
		(impacto catastrofico))
	=>	(printout t crlf "Alto" crlf)
		(assert (recomendacion (mensaje "Alto")))
)

(defrule rule4-1
	(categoria-riesgo
		(prob rara-vez)
		(impacto critico))
	=>	(printout t crlf "Moderado" crlf)
		(assert (recomendacion (mensaje "Moderado")))
)

(defrule rule4-2
	(categoria-riesgo
		(prob rara-vez)
		(impacto marginal))
	=>	(printout t crlf "Bajo" crlf)
		(assert (recomendacion (mensaje "Bajo")))
)

(defrule rule4-3
	(categoria-riesgo
		(prob rara-vez)
		(impacto insignificante))
	=>	(printout t crlf "Bajo" crlf)
		(assert (recomendacion (mensaje "Bajo")))
)

(defrule rule5-0
	(categoria-riesgo
		(prob improbable)
		(impacto catastrofico))
	=>	(printout t crlf "Moderado" crlf)
		(assert (recomendacion (mensaje "Moderado")))
)

(defrule rule5-1
	(categoria-riesgo
		(prob improbable)
		(impacto critico))
	=>	(printout t crlf "Bajo" crlf)
		(assert (recomendacion (mensaje "Bajo")))
)

(defrule rule5-2
	(categoria-riesgo
		(prob improbable)
		(impacto marginal))
	=>	(printout t crlf "Bajo" crlf)
		(assert (recomendacion (mensaje "Bajo")))
)

(defrule rule5-3
	(categoria-riesgo
		(prob improbable)
		(impacto insignificante))
	=>	(printout t crlf "Bajo" crlf)
		(assert (recomendacion (mensaje "Bajo")))
)





