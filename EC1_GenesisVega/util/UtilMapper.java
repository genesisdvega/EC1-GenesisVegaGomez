package pe.idat.Calificada.util;

import java.util.ArrayList;
import java.util.Collection;

import pe.idat.Calificada.entity.Cuarto;
import pe.idat.Calificada.entity.Dueno;
import pe.idat.Calificada.entity.Limpiador;
import pe.idat.Calificada.entity.Piso;
import pe.idat.Calificada.entity.UserVO;
import pe.idat.Calificada.mapper.CuartoMapper;
import pe.idat.Calificada.mapper.DuenoMapper;
import pe.idat.Calificada.mapper.LimpiadorMapper;
import pe.idat.Calificada.mapper.PisoMapper;
import pe.idat.Calificada.mapper.UserMapper;

public class UtilMapper 
{
	public static Collection<CuartoMapper> toCuarto(Collection<Cuarto> cuartos)
	{
		Collection<CuartoMapper> mapper=new ArrayList<>();
		
		for(Cuarto cuarto:cuartos) 
		{
			CuartoMapper cuartoMapper=new CuartoMapper(cuarto);
			mapper.add(cuartoMapper);
		}
		
		return mapper;
	}
	
	public static Collection<DuenoMapper> toDueno(Collection<Dueno> duenos)
	{
		Collection<DuenoMapper> mapper=new ArrayList<>();
		
		for(Dueno dueno:duenos) 
		{
			DuenoMapper duenoMapper=new DuenoMapper(dueno);
			mapper.add(duenoMapper);
		}
		
		return mapper;
	}
	
	public static Collection<LimpiadorMapper> toLimpiador(Collection<Limpiador> limpiadores)
	{
		Collection<LimpiadorMapper> mapper=new ArrayList<>();
		
		for(Limpiador limpiador:limpiadores) 
		{
			LimpiadorMapper limpiadorMapper=new LimpiadorMapper(limpiador);
			mapper.add(limpiadorMapper);
		}
		
		return mapper;
	}
	
	public static Collection<PisoMapper> toPiso(Collection<Piso> pisos)
	{
		Collection<PisoMapper> mapper=new ArrayList<>();
		
		for(Piso piso:pisos) 
		{
			PisoMapper pisoMapper=new PisoMapper(piso);
			mapper.add(pisoMapper);
		}
		
		return mapper;
	}
	
	public static Collection<UserMapper> toUser(Collection<UserVO> users) {
        Collection<UserMapper> mapper = new ArrayList<>();

        for (UserVO user : users) {
            UserMapper usersMapper = new UserMapper(user);
            mapper.add(usersMapper);
        }

        return mapper;
    }



    public static UserMapper toUser(UserVO user) {
        UserMapper userMapper = new UserMapper(user);
        return userMapper;
    }
}

