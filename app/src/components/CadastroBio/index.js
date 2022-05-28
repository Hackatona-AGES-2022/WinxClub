import { useState } from 'react';
import FormControl from '@mui/material/FormControl';
import Input from '@mui/material/Input';
import InputLabel from '@mui/material/InputLabel';
import Button from '@mui/material/Button'
import Typography from '@mui/material/Typography'
import { Box } from '@mui/system';



export default function CadastroBio({ nome, area, spec }) {
    const [bio, setBio] = useState('')
    const [historia, setHistoria] = useState('')

    const handleChangeBio = (event) => {
        setBio(event.target.value);
    };

    const handleChangehistoria = (event) => {
        setHistoria(event.target.value);
    };


    function onClickHandler() {
        //update no banco
    }


    return (
        <Box component="form" variant="filled" sx={{ display: "flex", flexDirection: "column", justifyContent: "space-between", height: "300px", alignItems: "right" }} >
            <Box sx={{ display: "flex", flexDirection: "column", justifyContent: "space-between", alignItems: "start", height: "110px" }}>
                <Typography variant="h5" color="text.primary">
                    {nome}
                </Typography>
                <Typography variant="h5" color="text.primary">
                    {area}
                </Typography>
                <Typography variant="h5" color="text.primary">
                    {spec}
                </Typography>
            </Box>
            <Typography variant="h7" color="text.primary">
                Bio
            </Typography>
            <FormControl variant="filled">
                <InputLabel htmlFor="component-simple" variant="filled">Escreva um pouco sobre quem é você...</InputLabel>
                <Input id="component-simple" value={bio} onChange={handleChangeBio} />
            </FormControl>

            <Typography variant="h7" color="text.primary">
                História
            </Typography>
            <FormControl variant="filled">
                <InputLabel htmlFor="component-simple" variant="filled" rows={5}>Escreva um pouco sobre sua vida antes e depois da imigração</InputLabel>
                <Input id="component-simple" value={historia} onChange={handleChangehistoria} />
            </FormControl>
            <Button variant="contained" onClick={onClickHandler} sx={{ width: "180px", alignSelf: "flex-end " }} >Próxima Etapa</Button>
        </ Box >
    );
}
