package apis;
import com.google.gson.annotations.SerializedName;
public class endereco {
	@SerializedName("cep")
private String cep;
	@SerializedName("logradouro")
private String logradouro;
	@SerializedName("complemento")
private String complemento;
	@SerializedName("unidade")
private String unidade;
	@SerializedName("bairro")
private String bairro;
	@SerializedName("localidade")
private String localidade;
	@SerializedName("uf")
private String uf;
	@SerializedName("estado")
private String estado;
	@SerializedName("regiao")
private String regiao;
	@SerializedName("ibge")
private String ibge;
@SerializedName("gia")
private String gia;
@SerializedName("ddd")
private String ddd;
@SerializedName("siafi")
private String siafi;
@Override
public String toString() {
	return "endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", unidade="
			+ unidade + ", bairro=" + bairro + ", localidade=" + localidade + ", uf=" + uf + ", estado=" + estado
			+ ", regiao=" + regiao + ", ibge=" + ibge + ", gia=" + gia + ", ddd=" + ddd + ", siafi=" + siafi + "]";
}
public String getCep() {
	return cep;
}
public String getLogradouro() {
	return logradouro;
}
public String getComplemento() {
	return complemento;
}
public String getUnidade() {
	return unidade;
}
public String getBairro() {
	return bairro;
}
public String getLocalidade() {
	return localidade;
}
public String getUf() {
	return uf;
}
public String getEstado() {
	return estado;
}
public String getRegiao() {
	return regiao;
}
public String getIbge() {
	return ibge;
}
public String getGia() {
	return gia;
}
public String getDdd() {
	return ddd;
}
public String getSiafi() {
	return siafi;
}
public void setCep(String cep) {
	this.cep = cep;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public void setUnidade(String unidade) {
	this.unidade = unidade;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public void setLocalidade(String localidade) {
	this.localidade = localidade;
}
public void setUf(String uf) {
	this.uf = uf;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public void setRegiao(String regiao) {
	this.regiao = regiao;
}
public void setIbge(String ibge) {
	this.ibge = ibge;
}
public void setGia(String gia) {
	this.gia = gia;
}
public void setDdd(String ddd) {
	this.ddd = ddd;
}
public void setSiafi(String siafi) {
	this.siafi = siafi;
}
}
