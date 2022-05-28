import { useState } from 'react';
import Paper from '@mui/material/Paper';
import InputBase from '@mui/material/InputBase';
import Divider from '@mui/material/Divider';
import IconButton from '@mui/material/IconButton';
import LogoutIcon from '@mui/icons-material/Logout';
import SearchIcon from '@mui/icons-material/Search';
import { Box } from '@mui/material';

import Logo from '../../views/logo.jpeg'
import SearchWidget from '../SearchWidget'

export default function customizedInputBase() {
  const [value, setValue] = useState('')

  const handleEnter = (event) => {
    console.log(event.target.value)
  }

  function handleKeyDown(e) {
    if (e.key === 'Enter') {
      console.log(value)
    }
  }

  return (
    <>
    <Paper
      component="form"
      sx={{ p: '2px 4px', display: 'flex', justifyContent: 'space-between', alignItems: 'center', width: '100%' }}
    >
      <Box>
        <Box
          component="img"
          sx={{
            marginTop: '5px',
            height: 42,
            width: 38,
          }}
          alt="Logo"
          src={Logo}
        />
        </Box>
      <Box>
        <IconButton sx={{ p: '10px' }} aria-label="search">
          <SearchIcon />
        </IconButton>
        <InputBase
          sx={{ ml: 1 }}
          placeholder="Pesquisa"
          inputProps={{ 'aria-label': 'Pesquise' }}
          onChange={(e) => handleEnter}
          onKeyDown={(e) => handleKeyDown}
        />
      </Box>
      <Box>
        <IconButton sx={{ p: '10px' }} aria-label="logout">
          <LogoutIcon />
        </IconButton>
      </Box>
    </Paper>
    </>
  );
}
