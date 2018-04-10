package ua.logos.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="product")
@NoArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity{

	private String name;
	
	@Column(length = 500)
	private String description;
	
	@Column(columnDefinition = "DECIMAL(6,2)")
	private BigDecimal price;
	
}
