import Card from '@mui/material/Card';
import { useState, useEffect } from 'react';
import CardContent from '@mui/material/CardContent'
import Typography from '@mui/material/Typography'

import CadastroInfos from '../CadastroInfos';
import CadastroBio from '../CadastroBio';



export default function Cadastro() {
    const [confirmTela, setConfirmTela] = useState(false)
    const [area, setArea] = useState('')
    const [especi, setEspeci] = useState('')
    const [nome, setNome] = useState('')

    function onClickHandler() {
        setConfirmTela(true)
    }


    return (
        <Card sx={{ maxWidth: "100%" }}>
            <CardContent>
                <Typography gutterBottom variant="h5" component="div" >
                    Cadastro
                </Typography>
                {confirmTela ?
                    <CadastroBio nome={nome} area={area} spec={especi} /> :
                    <CadastroInfos changeView={onClickHandler} fnome={setNome} farea={setArea} fespec={setEspeci} />}
            </CardContent>
        </Card >
    );
}
