
// {"cep":"70855100","tipoDeLogradouro":"SQN","logradouro":"407 Bloco J","bairro":"Asa Norte","cidade":"Brasília","estado":"DF"}
public class CepResponse{
	private String cep;
	private String tipoDeLogradouro;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	
	
	
	/**
	 * Get cep.
	 *
	 * @return cep as String.
	 */
	public String getCep()
	{
	    return cep;
	}
	
	/**
	 * Set cep.
	 *
	 * @param cep the value to set.
	 */
	public void setCep(String cep)
	{
	    this.cep = cep;
	}
	
	/**
	 * Get tipoDeLogradouro.
	 *
	 * @return tipoDeLogradouro as String.
	 */
	public String getTipoDeLogradouro()
	{
	    return tipoDeLogradouro;
	}
	
	/**
	 * Set tipoDeLogradouro.
	 *
	 * @param tipoDeLogradouro the value to set.
	 */
	public void setTipoDeLogradouro(String tipoDeLogradouro)
	{
	    this.tipoDeLogradouro = tipoDeLogradouro;
	}
	
	/**
	 * Get logradouro.
	 *
	 * @return logradouro as String.
	 */
	public String getLogradouro()
	{
	    return logradouro;
	}
	
	/**
	 * Set logradouro.
	 *
	 * @param logradouro the value to set.
	 */
	public void setLogradouro(String logradouro)
	{
	    this.logradouro = logradouro;
	}
	
	/**
	 * Get bairro.
	 *
	 * @return bairro as String.
	 */
	public String getBairro()
	{
	    return bairro;
	}
	
	/**
	 * Set bairro.
	 *
	 * @param bairro the value to set.
	 */
	public void setBairro(String bairro)
	{
	    this.bairro = bairro;
	}
	
	/**
	 * Get cidade.
	 *
	 * @return cidade as String.
	 */
	public String getCidade()
	{
	    return cidade;
	}
	
	/**
	 * Set cidade.
	 *
	 * @param cidade the value to set.
	 */
	public void setCidade(String cidade)
	{
	    this.cidade = cidade;
	}
	
	/**
	 * Get estado.
	 *
	 * @return estado as String.
	 */
	public String getEstado()
	{
	    return estado;
	}
	
	/**
	 * Set estado.
	 *
	 * @param estado the value to set.
	 */
	public void setEstado(String estado)
	{
	    this.estado = estado;
	}
}
