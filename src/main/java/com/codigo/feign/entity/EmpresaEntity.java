package com.codigo.feign.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "empresa")
@Getter
@Setter
public class EmpresaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idEmpresa;
    @Column(name = "num_docu")
    private String num_docu;
    @Column(name = "razon_social")
    private String razon_social;
    @Column(name = "nom_comercial")
    private String nom_comercial;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "usua_crea")
    private String usua_crea;
    @Column(name = "date_create")
    private Timestamp date_create;
    @Column(name = "usua_modif")
    private String usua_modif;
    @Column(name = "date_modif")
    private Timestamp date_modif;
    @Column(name = "usua_delet")
    private String usua_delet;
    @Column(name = "date_delet")
    private Timestamp date_delet;
    @ManyToOne(optional = false)
    @JoinColumn(name = "tipo_documento_id", nullable = false)
    private TipoDocumentoEntity tipoDocumento;
}
