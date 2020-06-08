package lib.com.antalogic.tender.entities.other.ftp.region;

import lib.com.antalogic.tender.entities.other.ftp.FtpEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Indexed
@Data
@EqualsAndHashCode
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Oktmo implements FtpEntity {
    @Id
    private String code;
    @Column(columnDefinition = "TEXT")
    private String parentCode;
    @Column(columnDefinition = "TEXT")
    @Field(termVector = TermVector.YES)
    private String name;
    @Field
    @Column(columnDefinition = "TEXT")
    private String oktmoCode;
    @Column(columnDefinition = "TEXT")
    private String firstPart;
    @Column(columnDefinition = "TEXT")
    private String secondPart;
    @Column(columnDefinition = "TEXT")
    private String thirdPart;
    @Column(columnDefinition = "TEXT")
    private String settlementType;
    @Column(columnDefinition = "TEXT")
    private String registerName;
    private boolean actual;
    @Column(nullable = false)
    private Boolean hasChields = false;
}
