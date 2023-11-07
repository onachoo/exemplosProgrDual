package UD3;
public class Empregado 
{
	//PROPIEDADES	
	public String nome;
	public int salario;
	
    public Empregado(String nom, int soldo)
    {
        nome = nom;
        salario = soldo;
    }


	//MÉTODOS
	
	public void asignaNome(String nomeAsignado)
	{
		nome = nomeAsignado;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNome()
	{
		return nome;
	}
}