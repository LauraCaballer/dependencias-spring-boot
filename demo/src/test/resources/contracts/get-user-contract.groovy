import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Obtener detalles de un usuario con id 1"

    request {
        method 'GET'
        url '/api/users/1'
    }
    response {
        status 200
        headers {
            contentType(applicationJson())
        }
        body(
                id: 1,
                name: "Juan Sangano"
        )
    }
}
