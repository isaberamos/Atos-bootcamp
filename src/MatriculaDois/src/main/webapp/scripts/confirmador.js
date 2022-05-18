/**
 * Confirmando a exclusão de um contato
 */
 function confirmar(id) {
	let resposta = confirm("Confirma a exclusão do contato? ")
	
	if(resposta === true) {
		window.location.href = "delete?id=" + id
	}
}