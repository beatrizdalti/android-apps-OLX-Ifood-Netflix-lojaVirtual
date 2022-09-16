package com.biamailov3.ifoodclone.model;

public enum StatusPedido {
    ENTREGUE,
    PENDENTE,
    PREPARACAO,
    SAIU_ENTREGA,
    CANCELADO_EMPRESA,
    CANCELADO_USUARIO;

    public static String getStatus(StatusPedido statusPedido) {
        String status;

        switch (statusPedido) {
            case ENTREGUE:
                status = "Entregue";
                break;
            case PREPARACAO:
                status = "Em preparação";
                break;
            case SAIU_ENTREGA:
                status = "Saiu para entrega";
                break;
            case CANCELADO_EMPRESA:
                status = "Cancelado pela empresa";
                break;
            case CANCELADO_USUARIO:
                status = "Cancelado pelo usuário";
                break;
            default:
                status = "Pendente";
                break;
        }

        return status;
    }
}