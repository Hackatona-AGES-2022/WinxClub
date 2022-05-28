import { useState } from 'react';
import FormControl from '@mui/material/FormControl';
import Input from '@mui/material/Input';
import InputLabel from '@mui/material/InputLabel';
import Button from '@mui/material/Button'
import { Box } from '@mui/system';
import Typography from '@mui/material/Typography'



export default function CadastroInfos({ changeView, fnome, farea, fespec }) {
    const [nome, setNome] = useState('')
    const [data, setData] = useState('')
    const [pais, setPais] = useState('')
    const [cidade, setCidade] = useState('')
    const [uf, setUf] = useState('')
    const [area, setArea] = useState('')
    const [especi, setEspeci] = useState('')
    const [email, setEmail] = useState('')
    const [cel, setCel] = useState('')
    const [error, setError] = useState(false);

    const handleChangeNome = (event) => {
        setNome(event.target.value);
        fnome(event.target.value);
        setError(false)
    };

    const handleChangeData = (event) => {
        setData(event.target.value);
        setError(false)
    };

    const handleChangePais = (event) => {
        setPais(event.target.value);
        setError(false)
    };

    const handleChangeCidade = (event) => {
        setCidade(event.target.value);
        setError(false)
    };

    const handleChangeuf = (event) => {
        setUf(event.target.value);
        setError(false)
    };

    const handleChangeArea = (event) => {
        setArea(event.target.value);
        farea(event.target.value);
        setError(false)
    };

    const handleChangeEspeci = (event) => {
        setEspeci(event.target.value);
        fespec(event.target.value);
        setError(false)
    };

    const handleChangeEmail = (event) => {
        setEmail(event.target.value);
        setError(false)
    };

    const handleChangeCel = (event) => {
        setCel(event.target.value);
        setError(false)
    };


    function onClickHandler() {
        if (
            nome !== ''
            && data !== ''
            && pais !== ''
            && cidade !== ''
            && uf !== ''
            && area !== ''
            && email !== ''
            && cel !== ''
        ) {
            changeView()
            //post no banco
        } else {
            setError(true)
        }
    }


    return (
        <Box component="form" sx={{ display: "flex", flexDirection: "column", justifyContent: "space-between", height: "800px", alignItems: "right" }} >
            <FormControl variant="standard" required>
                <InputLabel htmlFor="component-simple">Nome Completo</InputLabel>
                <Input id="component-simple" value={nome} onChange={handleChangeNome} />
            </FormControl>
            <FormControl variant="standard" required>
                <InputLabel htmlFor="component-simple">Data de Nascimento</InputLabel>
                <Input id="component-simple" value={data} onChange={handleChangeData} />
            </FormControl>
            <FormControl variant="standard" required>
                <InputLabel htmlFor="component-simple">Pais de origem</InputLabel>
                <Input id="component-simple" value={pais} onChange={handleChangePais} />
            </FormControl>
            <FormControl variant="standard" required>
                <InputLabel htmlFor="component-simple">Cidade Atual</InputLabel>
                <Input id="component-simple" value={cidade} onChange={handleChangeCidade} />
            </FormControl>
            <FormControl variant="standard" required>
                <InputLabel htmlFor="component-simple">UF</InputLabel>
                <Input id="component-simple" value={uf} onChange={handleChangeuf} />
            </FormControl>
            <FormControl variant="standard" required>
                <InputLabel htmlFor="component-simple">Area de Atuação</InputLabel>
                <Input id="component-simple" value={area} onChange={handleChangeArea} />
            </FormControl>
            <FormControl variant="standard">
                <InputLabel htmlFor="component-simple">Especialidade</InputLabel>
                <Input id="component-simple" value={especi} onChange={handleChangeEspeci} />
            </FormControl>
            <FormControl variant="standard" required>
                <InputLabel htmlFor="component-simple">E-mail</InputLabel>
                <Input id="component-simple" value={email} onChange={handleChangeEmail} />
            </FormControl>
            <FormControl variant="filled" required>
                <InputLabel htmlFor="component-simple">Celular</InputLabel>
                <Input id="component-simple" value={cel} onChange={handleChangeCel} />
            </FormControl>
            <Box sx={{ display: "flex", flexDirection: "row", justifyContent: "space-between", width: "100%" }}>
                {error ?
                    <Typography variant="body1" color="error.main">
                        Preencha todos os campos obrigatórios*
                    </Typography>
                    : <null />
                }
                <Button variant="contained" onClick={() => onClickHandler()} sx={{ width: "200px", alignSelf: "flex-end " }} >Próxima Etapa</Button>
            </ Box>
        </ Box >
    );
}
