import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import TextField from '@mui/material/TextField';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';


export default function LoginCard() {
    return (
        <Card sx={{ maxWidth: 300 }}>
            <CardContent>
                <Typography gutterBottom variant="h5" component="div">
                    Login
                </Typography>
                <TextField id="outlined-basic" label="Outlined" variant="outlined" />
                <TextField id="outlined-basic" label="Outlined" variant="outlined" />
                <Button variant="contained">Entrar</Button>
                <Typography variant="body2" color="text.secondary">
                    Ainda não tem uma conta?
                    <Button variant="text">Cadastre-se</Button>
                </Typography>
            </CardContent>
        </Card>
    );
}
