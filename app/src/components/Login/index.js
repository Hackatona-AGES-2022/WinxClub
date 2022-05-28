import Card from '@mui/material/Card';
import { useState, useEffect } from 'react';
import CardContent from '@mui/material/CardContent'
import Typography from '@mui/material/Typography'
import Button from '@mui/material/Button'
import FormControl from '@mui/material/FormControl';
import Input from '@mui/material/Input';
import InputLabel from '@mui/material/InputLabel';



export default function LoginCard() {
    const [email, setEmail] = useState('')
    const [senha, setSenha] = useState('')

    const handleChangeEmail = (event) => {
        setEmail(event.target.value);
    };

    const handleChangeSenha = (event) => {
        setSenha(event.target.value);
    };


    function onClickHandler() {
        //get no banco
    }

    function changeView() {
        //trocar para tela de cadastro
    }


    return (
        <Card sx={{ maxWidth: "100%" }}>
            <CardContent component="form" sx={{ display: "flex", flexDirection: "column", justifyContent: "space-around", height: "320px" }}>
                <Typography gutterBottom variant="h5" component="div" >
                    Login
                </Typography>
                <FormControl variant="standard">
                    <InputLabel htmlFor="component-simple">Email</InputLabel>
                    <Input id="component-simple" value={email} onChange={handleChangeEmail} />
                </FormControl>
                <FormControl variant="standard" sx={{ marginTop: "8px", marginBottom: "8px" }}>
                    <InputLabel htmlFor="component-simple">Email</InputLabel>
                    <Input id="component-simple" value={senha} onChange={handleChangeSenha} />
                </FormControl>
                <Button variant="contained" onClick={onClickHandler} fullWidth>Entrar</Button>
                <Typography variant="body2" color="text.secondary">
                    Ainda não tem uma conta?
                    <Button size="small" variant="text" id="button-text" onClick={changeView} > Cadastre - se</Button>
                </Typography>
            </CardContent>
        </Card >
    );
}
