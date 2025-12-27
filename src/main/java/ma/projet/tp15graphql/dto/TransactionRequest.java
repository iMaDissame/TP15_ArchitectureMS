package ma.projet.tp15graphql.dto;

import lombok.Data;
import ma.projet.tp15graphql.entities.TypeTransaction;

import java.util.Date;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private Date date;
    private TypeTransaction type;
}
