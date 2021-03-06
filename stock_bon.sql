PGDMP                          t            stock    9.4.4    9.4.4 0    (           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            )           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            *           1262    16393    stock    DATABASE     w   CREATE DATABASE stock WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'fr_FR.UTF-8' LC_CTYPE = 'fr_FR.UTF-8';
    DROP DATABASE stock;
             postgres    false            +           1262    16393    stock    COMMENT     E   COMMENT ON DATABASE stock IS 'debut de javafx avec accesss a la bd';
                  postgres    false    2090                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            ,           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    5            -           0    0    public    ACL     �   REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;
                  postgres    false    5            �            3079    11895    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            .           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    183            �            1259    16406    client    TABLE     �   CREATE TABLE client (
    id integer NOT NULL,
    nom character varying,
    adresse character varying,
    contact character varying
);
    DROP TABLE public.client;
       public         postgres    false    5            �            1259    16409    client_id_seq    SEQUENCE     o   CREATE SEQUENCE client_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.client_id_seq;
       public       postgres    false    5    172            /           0    0    client_id_seq    SEQUENCE OWNED BY     1   ALTER SEQUENCE client_id_seq OWNED BY client.id;
            public       postgres    false    173            �            1259    16435    commande    TABLE     �   CREATE TABLE commande (
    "idCommande" integer NOT NULL,
    num_facture integer,
    code_produit integer,
    reference character varying,
    prix_vente real,
    quantite integer,
    subtotal real
);
    DROP TABLE public.commande;
       public         postgres    false    5            �            1259    16433    commande_idCommande_seq    SEQUENCE     {   CREATE SEQUENCE "commande_idCommande_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public."commande_idCommande_seq";
       public       postgres    false    177    5            0           0    0    commande_idCommande_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE "commande_idCommande_seq" OWNED BY commande."idCommande";
            public       postgres    false    176            �            1259    16424    fournisseur    TABLE     �   CREATE TABLE fournisseur (
    "idFournisseur" integer NOT NULL,
    "nomSociete" character varying,
    "nomFournisseur" character varying(255)
);
    DROP TABLE public.fournisseur;
       public         postgres    false    5            �            1259    16422    fournisseur_idFournisseur_seq    SEQUENCE     �   CREATE SEQUENCE "fournisseur_idFournisseur_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public."fournisseur_idFournisseur_seq";
       public       postgres    false    5    175            1           0    0    fournisseur_idFournisseur_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE "fournisseur_idFournisseur_seq" OWNED BY fournisseur."idFournisseur";
            public       postgres    false    174            �            1259    16463    produit    TABLE       CREATE TABLE produit (
    id integer NOT NULL,
    code_produit integer NOT NULL,
    reference character varying,
    designation character varying,
    rangement character varying,
    fournisseur character varying,
    remise integer,
    prix real,
    stock integer
);
    DROP TABLE public.produit;
       public         postgres    false    5            �            1259    16461    produit_code_produit_seq    SEQUENCE     z   CREATE SEQUENCE produit_code_produit_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.produit_code_produit_seq;
       public       postgres    false    5    182            2           0    0    produit_code_produit_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE produit_code_produit_seq OWNED BY produit.code_produit;
            public       postgres    false    181            �            1259    16459    produit_id_seq    SEQUENCE     p   CREATE SEQUENCE produit_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.produit_id_seq;
       public       postgres    false    182    5            3           0    0    produit_id_seq    SEQUENCE OWNED BY     3   ALTER SEQUENCE produit_id_seq OWNED BY produit.id;
            public       postgres    false    180            �            1259    16450    utilisateur    TABLE     �   CREATE TABLE utilisateur (
    id_user integer NOT NULL,
    username character varying,
    password character varying,
    type character varying
);
    DROP TABLE public.utilisateur;
       public         postgres    false    5            �            1259    16448    utilisateur_id_user_seq    SEQUENCE     y   CREATE SEQUENCE utilisateur_id_user_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.utilisateur_id_user_seq;
       public       postgres    false    5    179            4           0    0    utilisateur_id_user_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE utilisateur_id_user_seq OWNED BY utilisateur.id_user;
            public       postgres    false    178            �           2604    16411    id    DEFAULT     X   ALTER TABLE ONLY client ALTER COLUMN id SET DEFAULT nextval('client_id_seq'::regclass);
 8   ALTER TABLE public.client ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    173    172            �           2604    16438 
   idCommande    DEFAULT     p   ALTER TABLE ONLY commande ALTER COLUMN "idCommande" SET DEFAULT nextval('"commande_idCommande_seq"'::regclass);
 D   ALTER TABLE public.commande ALTER COLUMN "idCommande" DROP DEFAULT;
       public       postgres    false    177    176    177            �           2604    16427    idFournisseur    DEFAULT     |   ALTER TABLE ONLY fournisseur ALTER COLUMN "idFournisseur" SET DEFAULT nextval('"fournisseur_idFournisseur_seq"'::regclass);
 J   ALTER TABLE public.fournisseur ALTER COLUMN "idFournisseur" DROP DEFAULT;
       public       postgres    false    175    174    175            �           2604    16466    id    DEFAULT     Z   ALTER TABLE ONLY produit ALTER COLUMN id SET DEFAULT nextval('produit_id_seq'::regclass);
 9   ALTER TABLE public.produit ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    182    180    182            �           2604    16467    code_produit    DEFAULT     n   ALTER TABLE ONLY produit ALTER COLUMN code_produit SET DEFAULT nextval('produit_code_produit_seq'::regclass);
 C   ALTER TABLE public.produit ALTER COLUMN code_produit DROP DEFAULT;
       public       postgres    false    181    182    182            �           2604    16453    id_user    DEFAULT     l   ALTER TABLE ONLY utilisateur ALTER COLUMN id_user SET DEFAULT nextval('utilisateur_id_user_seq'::regclass);
 B   ALTER TABLE public.utilisateur ALTER COLUMN id_user DROP DEFAULT;
       public       postgres    false    179    178    179                      0    16406    client 
   TABLE DATA                     public       postgres    false    172   M/       5           0    0    client_id_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('client_id_seq', 26, true);
            public       postgres    false    173                       0    16435    commande 
   TABLE DATA                     public       postgres    false    177   f0       6           0    0    commande_idCommande_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('"commande_idCommande_seq"', 1, false);
            public       postgres    false    176                      0    16424    fournisseur 
   TABLE DATA                     public       postgres    false    175   �0       7           0    0    fournisseur_idFournisseur_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('"fournisseur_idFournisseur_seq"', 1, false);
            public       postgres    false    174            %          0    16463    produit 
   TABLE DATA                     public       postgres    false    182   �0       8           0    0    produit_code_produit_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('produit_code_produit_seq', 1, false);
            public       postgres    false    181            9           0    0    produit_id_seq    SEQUENCE SET     6   SELECT pg_catalog.setval('produit_id_seq', 1, false);
            public       postgres    false    180            "          0    16450    utilisateur 
   TABLE DATA                     public       postgres    false    179   �0       :           0    0    utilisateur_id_user_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('utilisateur_id_user_seq', 1, false);
            public       postgres    false    178            �           2606    16421 	   pk_client 
   CONSTRAINT     G   ALTER TABLE ONLY client
    ADD CONSTRAINT pk_client PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.client DROP CONSTRAINT pk_client;
       public         postgres    false    172    172            �           2606    16458    pk_idClient 
   CONSTRAINT     U   ALTER TABLE ONLY utilisateur
    ADD CONSTRAINT "pk_idClient" PRIMARY KEY (id_user);
 C   ALTER TABLE ONLY public.utilisateur DROP CONSTRAINT "pk_idClient";
       public         postgres    false    179    179            �           2606    16445    pk_idCommande 
   CONSTRAINT     Y   ALTER TABLE ONLY commande
    ADD CONSTRAINT "pk_idCommande" PRIMARY KEY ("idCommande");
 B   ALTER TABLE ONLY public.commande DROP CONSTRAINT "pk_idCommande";
       public         postgres    false    177    177            �           2606    16447    pk_idFournisseur 
   CONSTRAINT     b   ALTER TABLE ONLY fournisseur
    ADD CONSTRAINT "pk_idFournisseur" PRIMARY KEY ("idFournisseur");
 H   ALTER TABLE ONLY public.fournisseur DROP CONSTRAINT "pk_idFournisseur";
       public         postgres    false    175    175            �           2606    16472    pk_idProduit 
   CONSTRAINT     M   ALTER TABLE ONLY produit
    ADD CONSTRAINT "pk_idProduit" PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.produit DROP CONSTRAINT "pk_idProduit";
       public         postgres    false    182    182               	  x���1O!��>�ۮMnh˵�q���S[�)�Ik!�⷗ǩ�v�c����?<x�v�y�C���UR{�(Q�6�
���9Y7�3��{��`B*(���%�in�ÚZ�rz[����?ށ�����2�"u�.��Lwlw��]C����m�㽼H�#O�t��	~��k�lӌ����Ϟ�gA	�̃cr?������f�{���I�Dx��u��'1r��q�8�������������%��ؤ!����,�O�T��          
   x���             
   x���          %   
   x���          "   
   x���         