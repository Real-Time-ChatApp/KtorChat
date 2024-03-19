package com.marconi.room

class MemberAlreadyExistException : Exception(
    "There is already a member with that username in the room."
)