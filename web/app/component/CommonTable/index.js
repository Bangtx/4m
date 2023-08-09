import * as React from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import Box from '@mui/material/Box';

export default function CommonTable({columns, rows, className}) {
    return (
        <Box p={2}>
            <TableContainer component={Paper} className={className} sx={{maxWidth: 1200}}>
                <Table aria-label="simple table" size="medium">
                    <TableHead sx={{backgroundColor: '#FFEB3B'}}>
                        <TableRow>
                            {
                                columns.map((column, index) => {
                                    return <TableCell key={index}>{column.name}</TableCell>
                                })
                            }
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {rows.map((row, index) => (
                            <TableRow
                                key={row.name}
                                sx={{'&:last-child td, &:last-child th': {border: 0}}}
                            >
                                {
                                    Object.keys(row).map((key, index) => {
                                        return <TableCell key={index}>{row[key]}</TableCell>
                                    })
                                }
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        </Box>
    );
}