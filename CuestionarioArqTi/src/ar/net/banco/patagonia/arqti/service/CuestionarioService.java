package ar.net.banco.patagonia.arqti.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ar.net.banco.patagonia.arqti.dao.CuestionarioDao;
import ar.net.banco.patagonia.arqti.entities.CuestionarioItem;


@ManagedBean(name = "cuestionarioService")
@ApplicationScoped
public class CuestionarioService {

	
	public List<CuestionarioItem> getCuestionario(int i) {
		List<CuestionarioItem> list = new ArrayList<CuestionarioItem>();
		CuestionarioDao cuestionarioDao = new CuestionarioDao();
		list = cuestionarioDao.leerCuestionario(1);
		return list;
	}

}
