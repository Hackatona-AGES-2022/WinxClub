import ToggleButtonGroup from '@mui/material/ToggleButtonGroup';
import ToggleButton from '@mui/material/ToggleButton';

export default function VerticalToggleButtons() {
     const [view, setView] = useState('list');
   
     const handleChange = (event, nextView) => {
       setView(nextView);
     };
   
     return (
       <ToggleButtonGroup
         orientation="vertical"
         value={view}
         exclusive
         onChange={handleChange}
       >
         <ToggleButton value="module" aria-label="module">
           AAAA
         </ToggleButton>
         {/* <ToggleButton value="module" aria-label="module">
           <ViewModuleIcon />
         </ToggleButton>
         <ToggleButton value="quilt" aria-label="quilt">
           <ViewQuiltIcon />
         </ToggleButton> */}
       </ToggleButtonGroup>
     );
   }