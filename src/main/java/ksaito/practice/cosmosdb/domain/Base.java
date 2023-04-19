package ksaito.practice.cosmosdb.domain;

import lombok.Data;

@Data
public abstract class Base {
  private String _rid;
  private String _self;
  private String _etag;
  private String _attachments;
  private long _ts;
}
