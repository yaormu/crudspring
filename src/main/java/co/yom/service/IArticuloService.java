package co.yom.service;
import co.yom.model.dto.ArticuloDTO;
import java.util.List;

public interface IArticuloService {

    public List<ArticuloDTO> listarTodosLosArticulos();

    public ArticuloDTO guardarArticulo(ArticuloDTO articuloDTO);

    public ArticuloDTO eliminarArticulo(Long codigo);

    public ArticuloDTO obtenerArticulosPorId(Long codigo);

    public ArticuloDTO actualizarArticulo(Long codigo, ArticuloDTO detallesArticuloDTO);

}
