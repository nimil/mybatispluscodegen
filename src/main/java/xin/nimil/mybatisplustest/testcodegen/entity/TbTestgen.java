package xin.nimil.mybatisplustest.testcodegen.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author nimil
 * @since 2019-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbTestgen implements Serializable {

    private static final long serialVersionUID = 1L;

    private String testgen;


}
