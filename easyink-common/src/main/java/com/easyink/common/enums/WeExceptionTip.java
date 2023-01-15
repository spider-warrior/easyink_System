package com.easyink.common.enums;

/**
 * 企业微信接口错误码提示
 */
public enum WeExceptionTip {

    WE_EXCEPTION_TIP_LOSS_1(-1, "系统繁忙", "服务器暂不可用，建议稍候重试。建议重试次数不超过3次。"),
    WE_EXCEPTION_TIP_40001(40001, "Secret错误，请检查企微配置", "secret在应用详情/通讯录管理助手可查看"),
    WE_EXCEPTION_TIP_40003(40003, "未在通讯录找到该成员", "1）有效的UserID需要满足：长度1~64字符，由英文字母、数字、中划线、下划线以及点号构成。2）除了创建用户，其余使用UserID的接口，还要保证UserID必须在通讯录中存在。"),
    WE_EXCEPTION_TIP_40004(40004, "文件不符合要求", "不满足系统文件要求【图片（image）、语音（voice）、视频（video），普通文件（file）】。"),
    WE_EXCEPTION_TIP_40005(40005, "文件类型错误", "合法的type类型【媒体文件类型，分别有图片（image）、语音（voice）、视频（video），普通文件（file）】"),
    WE_EXCEPTION_TIP_40006(40006, "文件小于或超出限定大小", "系统文件要求【所有文件size必须大于5个字节，图片（image）：2MB，语音（voice） ：2MB，视频（video） ：10MB，普通文件（file）：20MB】"),
    WE_EXCEPTION_TIP_40007(40007, "媒体文件获取失败", "不合法的媒体文件。确认【1）媒体文件ID的获取方式，是否存在。注：上传临时素材生成的medida_id，有效期是3天。2）媒体文件类型应符合接口要求（比如发送图片消息，此时不能用音频文件的media_id）。\n】"),
    WE_EXCEPTION_TIP_40008(40008, "消息类型错误", "合法的msgtype取值【文本消息、图片消息、语音消息、视频消息、文件消息、文本卡片消息、图文消息、图文消息（mpnews）、markdown消息、小程序通知消息、任务卡片消息】"),
    WE_EXCEPTION_TIP_40009(40009, "图片超出限定大小", "图片大小的系统限制，图片（image）：2MB"),
    WE_EXCEPTION_TIP_40011(40011, "视频超出限定大小", "视频大小的系统限制，视频（video） ：10MB"),
    WE_EXCEPTION_TIP_40013(40013, "未找到该企业", "需确认CorpID是否填写正确，在 web管理端-设置 可查看"),
    WE_EXCEPTION_TIP_40014(40014, "登录已过期", "access_token参数错误。确认：【1）access_token的获取方式 ，2）access_token是否已过期】，可以重新获取一次access_token解决"),
    WE_EXCEPTION_TIP_40016(40016, "不合法的按钮个数", "菜单按钮1-3个"),
    WE_EXCEPTION_TIP_40017(40017, "不合法的按钮类型", "支持的类型【click、view、scancode_push、scancode_waitmsg、pic_sysphoto、pic_photo_or_album、pic_weixin、location_select、view_miniprogram】"),
    WE_EXCEPTION_TIP_40018(40018, "不合法的按钮名字长度", "长度应不超过16个字节"),
    WE_EXCEPTION_TIP_40019(40019, "不合法的按钮KEY长度", "长度应不超过128字节"),
    WE_EXCEPTION_TIP_40020(40020, "不合法的按钮URL长度", "长度应不超过1024字节"),
    WE_EXCEPTION_TIP_40022(40022, "不合法的子菜单级数", "只能包含一级菜单和二级菜单"),
    WE_EXCEPTION_TIP_40023(40023, "不合法的子菜单按钮个数", "子菜单按钮1-5个"),
    WE_EXCEPTION_TIP_40024(40024, "不合法的子菜单按钮类型", "支持的类型，参考：按钮类型"),
    WE_EXCEPTION_TIP_40025(40025, "不合法的子菜单按钮名字长度", "支持的类型，参考：按钮类型"),
    WE_EXCEPTION_TIP_40026(40026, "不合法的子菜单按钮KEY长度", "-"),
    WE_EXCEPTION_TIP_40027(40027, "不合法的子菜单按钮URL长度", "长度应不超过1024字节"),
    WE_EXCEPTION_TIP_40029(40029, "oauth_code已失效", "查看帮助"),
    WE_EXCEPTION_TIP_40031(40031, "有成员未在通讯录中，请重新选择", "指定的UserID列表，至少存在一个UserID不在通讯录中"),
    WE_EXCEPTION_TIP_40032(40032, "成员过多，请分批操作", "查看帮助"),
    WE_EXCEPTION_TIP_40033(40033, "服务异常", "不能包含\\uxxxx格式的字符"),
    WE_EXCEPTION_TIP_40035(40035, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_40039(40039, "URL超出限定长度", "url长度限制1024个字节"),
    WE_EXCEPTION_TIP_40050(40050, "请先创建会话", "会话需要先创建后，才可修改会话详情或者发起聊天"),
    WE_EXCEPTION_TIP_40054(40054, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_40055(40055, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_40056(40056, "未在企业下找到该应用", "查看帮助"),
    WE_EXCEPTION_TIP_40057(40057, "不合法的callbackurl或者callbackurl验证失败", "可自助到开发调试工具重现"),
    WE_EXCEPTION_TIP_40058(40058, "服务异常", "传递参数不符合系统要求，需要参照具体API接口说明"),
    WE_EXCEPTION_TIP_40059(40059, "服务异常", "开关标志位只能填 0 或者 1"),
    WE_EXCEPTION_TIP_40063(40063, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_40066(40066, "有部门未在通讯录中，请重新选择", "部门列表为空，或者至少存在一个部门ID不存在于通讯录中"),
    WE_EXCEPTION_TIP_40068(40068, "请先选择标签", "标签ID未指定，或者指定的标签ID不存在"),
    WE_EXCEPTION_TIP_40070(40070, "未在通讯录找到指定的成员或部门", "查看帮助"),
    WE_EXCEPTION_TIP_40071(40071, "该标签已存在", "标签名字已经存在"),
    WE_EXCEPTION_TIP_40072(40072, "标签名为空或超出限定长度", "不允许为空，最大长度限制为32个字（汉字或英文字母）"),
    WE_EXCEPTION_TIP_40073(40073, "用户不存在", "openid不存在，需确认获取来源"),
    WE_EXCEPTION_TIP_40074(40074, "服务异常", "图文消息支持保密类型需改用mpnews"),
    WE_EXCEPTION_TIP_40077(40077, "服务异常", "预授权码不存在，参考：获取预授权码"),
    WE_EXCEPTION_TIP_40078(40078, "服务异常", "需确认获取来源，并且只能消费一次"),
    WE_EXCEPTION_TIP_40080(40080, "Secret错误，请重新设置", "套件secret可在第三方管理端套件详情查看"),
    WE_EXCEPTION_TIP_40082(40082, "第三方应用授权已失效", "查看帮助"),
    WE_EXCEPTION_TIP_40083(40083, "第三方应用不存在", "suite_id不存在"),
    WE_EXCEPTION_TIP_40084(40084, "授权码异常，请重新获取", "查看帮助"),
    WE_EXCEPTION_TIP_40085(40085, "服务异常", "suite_ticket不存在或者已失效"),
    WE_EXCEPTION_TIP_40086(40086, "未找到部分应用", "至少有一个不存在应用id"),
    WE_EXCEPTION_TIP_40088(40088, "jobid不存在", "请检查 jobid 来源"),
    WE_EXCEPTION_TIP_40089(40089, "批量任务的结果已清理", "系统仅保存最近5次批量任务的结果。可在通讯录查看实际导入情况"),
    WE_EXCEPTION_TIP_40091(40091, "Secret错误，请检查企微配置", "可能用了别的企业的secret"),
    WE_EXCEPTION_TIP_40092(40092, "导入文件存在不合法的内容", "查看帮助"),
    WE_EXCEPTION_TIP_40093(40093, "服务异常", "请检查用于签名的jsapi_ticket是否是正确的，是否过期。可以通过获取相应jsapi_ticket接口获取当前的jsapi_ticket跟用于签名的jsapi_ticket比对是否一致，若jsapi_ticket还在有效期内，当前获取到的jsapi_ticket是一致的。若jsapi_ticket没问题，请检查用于签名的url参数是不是正确的， url（当前网页的URL， 不包含#及其后面部分）。"),
    WE_EXCEPTION_TIP_40094(40094, "服务异常", "缺少主页URL参数，或者URL不合法（链接需要带上协议头，以 http:// 或者 https:// 开头）"),
    WE_EXCEPTION_TIP_40096(40096, "未找到该客户", "-"),
    WE_EXCEPTION_TIP_40097(40097, "该成员尚未离职", "离职成员外部联系人转移接口要求转出用户必须已经离职"),
    WE_EXCEPTION_TIP_40098(40098, "有员工未完成实名认证，请重新选择", "确认传入的userid是已经过实名认证成员的"),
    WE_EXCEPTION_TIP_40099(40099, "继承员工的客户已达上限，请重新选择", "-"),
    WE_EXCEPTION_TIP_40100(40100, "此员工的该客户已经在转移流程中", "-"),
    WE_EXCEPTION_TIP_40102(40102, "服务异常", "-"),
    WE_EXCEPTION_TIP_40123(40123, "服务异常", "请确认上传的内容是否为合法的图片内容"),
    WE_EXCEPTION_TIP_40124(40124, "推广活动里的sn禁止绑定", "-"),
    WE_EXCEPTION_TIP_40125(40125, "服务异常", "-"),
    WE_EXCEPTION_TIP_40126(40126, "企业标签个数达到上限，最多为3000个", "-"),
    WE_EXCEPTION_TIP_40127(40127, "服务异常", "检查uri链接的schema是否符合参数要求"),
    WE_EXCEPTION_TIP_40128(40128, "客户转接过于频繁（90天内只允许转接一次，同一个客户最多只能转接两次）", "-"),
    WE_EXCEPTION_TIP_40129(40129, "当前客户正在转接中", "-"),
    WE_EXCEPTION_TIP_40130(40130, "原跟进人与接手人一样，不可继承", "-"),
    WE_EXCEPTION_TIP_40131(40131, "当前客户已在客户端或第三方应用操作分配", "-"),
    WE_EXCEPTION_TIP_41001(41001, "认证失败，请重新登录", "-"),
    WE_EXCEPTION_TIP_41002(41002, "获取企业信息失败，请重新登录或联系管理员配置企业ID", "-"),
    WE_EXCEPTION_TIP_41004(41004, "获取应用配置失败，请联系管理员配置Secret", "-"),
    WE_EXCEPTION_TIP_41006(41006, "服务异常，请联系客服或技术人员", "media_id为调用接口必填参数，请确认是否有传递"),
    WE_EXCEPTION_TIP_41008(41008, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41009(41009, "请选择员工", "-"),
    WE_EXCEPTION_TIP_41010(41010, "请填写url", "-"),
    WE_EXCEPTION_TIP_41011(41011, "获取应用信息失败，请重新登录或联系管理员配置应用ID", "-"),
    WE_EXCEPTION_TIP_41016(41016, "请填写标题", "发送图文消息，标题是必填参数。请确认参数是否有传递。"),
    WE_EXCEPTION_TIP_41019(41019, "请选择部门", "查看帮助"),
    WE_EXCEPTION_TIP_41017(41017, "请选择标签", "-"),
    WE_EXCEPTION_TIP_41021(41021, "获取第三方应用信息异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41022(41022, "第三方应用授权信息异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41023(41023, "获取第三方应用令牌信息异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41024(41024, "获取应用配置失败，请联系管理员配置Secret", "-"),
    WE_EXCEPTION_TIP_41025(41025, "服务异常", "-"),
    WE_EXCEPTION_TIP_41033(41033, "服务异常", "发送文本卡片消息接口，description 是必填字段"),
    WE_EXCEPTION_TIP_41035(41035, "请选择客户", "-"),
    WE_EXCEPTION_TIP_41036(41036, "请填写已认证的企业对外简称", "企业对外简称必须是认证过的，如果要改回默认简称，传空字符串把对外简称清除就可以了"),
    WE_EXCEPTION_TIP_41037(41037, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41038(41038, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41039(41039, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41040(41040, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41041(41041, "每次最多可选择100人，请分批操作", "默认限制不超过100人(包括部门展开后的人数)"),
    WE_EXCEPTION_TIP_41042(41042, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41043(41043, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41044(41044, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41045(41045, "每个企业最多可配置50万个，当前企业已达上限", "-"),
    WE_EXCEPTION_TIP_41046(41046, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41047(41047, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41048(41048, "所选客户本月企业群发已达上限或客户不存在", "-"),
    WE_EXCEPTION_TIP_41049(41049, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41050(41050, "服务异常，请联系客服或技术人员", "欢迎语code(welcome_code)具有时效性，须在添加好友后20秒内使用"),
    WE_EXCEPTION_TIP_41051(41051, "客户和服务人员已经开始聊天了", "已经开始的聊天的客户不能发送欢迎语"),
    WE_EXCEPTION_TIP_41052(41052, "请选择有效的发送时间", "-"),
    WE_EXCEPTION_TIP_41053(41053, "客户未同意聊天存档", "须外部联系人同意服务须知后，成员才可发送欢迎语"),
    WE_EXCEPTION_TIP_41054(41054, "有员工还未激活企业微信客户端，请重新选择", "-"),
    WE_EXCEPTION_TIP_41055(41055, "群欢迎语模板数量达到上限", "-"),
    WE_EXCEPTION_TIP_41056(41056, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_41057(41057, "企业或服务商未绑定微信开发者账号", "-"),
    WE_EXCEPTION_TIP_41063(41063, "群发消息正在被派发中，请稍后再试", "创建企业群发后，立刻调用获取企业的全部群发记录的相关接口，将可能出现该错误"),
    WE_EXCEPTION_TIP_41078(41078, "创建朋友圈正在进行的异步任务总数超过了限制", "-"),
    WE_EXCEPTION_TIP_41079(41079, "朋友圈正在被派发中，请稍后再试", "-"),
    WE_EXCEPTION_TIP_41080(41080, "附件资源大小超过限制", "-"),
    WE_EXCEPTION_TIP_41081(41081, "附件资源的图片分辨率超过限制", "-"),
    WE_EXCEPTION_TIP_41082(41082, "附件资源的视频时长超过限制", "-"),
    WE_EXCEPTION_TIP_41102(41102, "请填写菜单名", "-"),
    WE_EXCEPTION_TIP_42001(42001, "授权已过期，请重新登录", "access_token有时效性，需要重新获取一次"),
    WE_EXCEPTION_TIP_42007(42007, "授权已过期，请重新登录", "pre_auth_code有时效性，需要重新获取一次"),
    WE_EXCEPTION_TIP_42009(42009, "服务异常", "suite_access_token有时效性，需要重新获取一次"),
    WE_EXCEPTION_TIP_42012(42012, "服务异常", "如果是agentConfig使用，请特别注意是否是使用”获取应用身份的ticket“来获取jsapi_ticket"),
    WE_EXCEPTION_TIP_42013(42013, "服务异常", "需要重新走登陆流程"),
    WE_EXCEPTION_TIP_42014(42014, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_42015(42015, "服务异常，请联系客服或技术人员", "-"),
    WE_EXCEPTION_TIP_42016(42016, "更新的task_id不存在", "-"),
    WE_EXCEPTION_TIP_42017(42017, "按钮key值不存在", "-"),
    WE_EXCEPTION_TIP_42018(42018, "按钮key值不合法", "-"),
    WE_EXCEPTION_TIP_42019(42019, "缺少按钮key值不合法", "-"),
    WE_EXCEPTION_TIP_42020(42020, "缺少按钮名称", "-"),
    WE_EXCEPTION_TIP_42021(42021, "device_access_token 过期", "-"),
    WE_EXCEPTION_TIP_42022(42022, "code已经被使用过。只能使用一次", "-"),
    WE_EXCEPTION_TIP_43004(43004, "指定的员工未绑定微信或未关注微工作台", "需要成员使用微信登录企业微信或者关注微工作台才能获取openid"),
    WE_EXCEPTION_TIP_43009(43009, "企业未验证主体", "-"),
    WE_EXCEPTION_TIP_44001(44001, "多媒体文件为空", "上传格式参考：上传临时素材，确认header和body的内容正确。"),
    WE_EXCEPTION_TIP_44004(44004, "消息不能为空", "发文本消息content为必填参数，且不能为空"),
    WE_EXCEPTION_TIP_45001(45001, "多媒体文件大小超过限制", "图片不可超过5M；音频不可超过5M；文件不可超过20M"),
    WE_EXCEPTION_TIP_45002(45002, "消息内容大小超过限制", "查看帮助"),
    WE_EXCEPTION_TIP_45004(45004, "描述内容长度需在4~120个字符之间", "设置应用若带有description参数，则长度必须为4至120个字符"),
    WE_EXCEPTION_TIP_45007(45007, "语音播放时间超过限制", "语音播放时长不能超过60秒"),
    WE_EXCEPTION_TIP_45008(45008, "图文消息的文章数量不能超过8条", "图文消息的文章数量不能超过8条"),
    WE_EXCEPTION_TIP_45009(45009, "系统繁忙，请稍后再试", "查看帮助"),
    WE_EXCEPTION_TIP_45022(45022, "应用name参数长度不符合系统限制", "设置应用若带有name参数，则不允许为空，且不超过32个字符"),
    WE_EXCEPTION_TIP_45024(45024, "帐号数量超过上限", "查看帮助"),
    WE_EXCEPTION_TIP_45026(45026, "触发删除用户数的保护", "限制参考：全量覆盖成员"),
    WE_EXCEPTION_TIP_45029(45029, "服务异常，请联系客服或技术人员", "查看帮助"),
    WE_EXCEPTION_TIP_45032(45032, "图文消息author参数长度超过限制", "最长64个字节"),
    WE_EXCEPTION_TIP_45033(45033, "系统繁忙，请稍后再试", "查看帮助"),
    WE_EXCEPTION_TIP_45034(45034, "url必须有协议头", "在url前面加上协议头 http:// 或 https://"),
    WE_EXCEPTION_TIP_46003(46003, "菜单未设置", "菜单需发布后才能获取到数据"),
    WE_EXCEPTION_TIP_46004(46004, "未在通讯录下找到该成员", "需要确认指定的用户存在于通讯录中"),
    WE_EXCEPTION_TIP_48002(48002, "没有操作权限，请检查企业微信管理后台配置是否与系统企微配置一致", "查看帮助"),
    WE_EXCEPTION_TIP_48003(48003, "第三方应用授权信息异常，请联系客服或技术人员", "确认suite_access_token由指定的suite_id生成"),
    WE_EXCEPTION_TIP_48004(48004, "没有操作权限，请检查企业微信管理后台是否授权应用", "可能是无授权或授权已被取消"),
    WE_EXCEPTION_TIP_48005(48005, "服务异常", "接口已不再支持，建议改用新接口或者新方案"),
    WE_EXCEPTION_TIP_48006(48006, "企业长时间未使用应用，应用操作权限被回收，请在企业微信管理后台重新启用", "由于企业长时间未使用应用，接口权限被收回，需企业管理员重新启用"),
    WE_EXCEPTION_TIP_50001(50001, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_50002(50002, "成员不在权限范围，请在企业微信管理后台检查应用的权限范围", "请检查应用或管理组的权限范围"),
    WE_EXCEPTION_TIP_50003(50003, "应用已禁用，请在企业微信管理后台开启", "查看帮助"),
    WE_EXCEPTION_TIP_60001(60001, "部门长度不符合限制", "部门名称不能为空且长度不能超过32个字"),
    WE_EXCEPTION_TIP_60003(60003, "未在通讯录找到该部门", "需要确认部门ID是否有带，并且存在通讯录中"),
    WE_EXCEPTION_TIP_60004(60004, "未在通讯录找到父部门", "需要确认父亲部门ID是否有带，并且存在通讯录中"),
    WE_EXCEPTION_TIP_60005(60005, "部门下存在成员，不可删除", "不允许删除有成员的部门"),
    WE_EXCEPTION_TIP_60006(60006, "部门下存在子部门，不可删除", "不允许删除有子部门的部门"),
    WE_EXCEPTION_TIP_60007(60007, "不允许删除根部门", "-"),
    WE_EXCEPTION_TIP_60008(60008, "部门已存在", "部门ID或者部门名称已存在"),
    WE_EXCEPTION_TIP_60009(60009, "部门名称含有非法字符", "不能含有 \\:?*“<>| 等字符"),
    WE_EXCEPTION_TIP_60010(60010, "部门存在循环关系", "查看帮助"),
    WE_EXCEPTION_TIP_60011(60011, "请在企业微信管理后台检查应用的可见范围", "查看帮助"),
    WE_EXCEPTION_TIP_60012(60012, "不允许删除默认应用", "默认应用的id为0"),
    WE_EXCEPTION_TIP_60020(60020, "访问ip不在服务商白名单，请联系客服", "查看帮助"),
    WE_EXCEPTION_TIP_60021(60021, "员工不在应用可见范围内，请在企业微信管理后台设置", "-"),
    WE_EXCEPTION_TIP_60028(60028, "不允许修改第三方应用的主页 URL", "第三方应用类型，不允许通过接口修改该应用的主页 URL"),
    WE_EXCEPTION_TIP_60102(60102, "该成员已存在", "-"),
    WE_EXCEPTION_TIP_60103(60103, "手机号码仅支持数字、+、-，且不超过32位", "长度不超过32位，字符仅支持数字，加号和减号"),
    WE_EXCEPTION_TIP_60104(60104, "手机号码已存在，成员手机号不能重复", "同一个企业内，成员的手机号不能重复。建议更换手机号，或者更新已有的手机记录。"),
    WE_EXCEPTION_TIP_60105(60105, "邮箱仅支持有效的email格式，且不超过64位", "长度不超过64位，且为有效的email格式"),
    WE_EXCEPTION_TIP_60106(60106, "邮箱已存在，成员邮箱不能重复", "同一个企业内，成员的邮箱不能重复。建议更换邮箱，或者更新已有的邮箱记录。"),
    WE_EXCEPTION_TIP_60107(60107, "微信号不合法", "微信号格式由字母、数字、”-“、”_“组成，长度为 3-20 字节，首字符必须是字母或”-“或”_“"),
    WE_EXCEPTION_TIP_60110(60110, "成员最多可归属于20个部门", "用户同时归属部门不超过20个"),
    WE_EXCEPTION_TIP_60111(60111, "未在通讯录找到该成员", "UserID参数为空，或者不存在通讯录中"),
    WE_EXCEPTION_TIP_60112(60112, "成员姓名不能超过64字符", "不能为空，且不能超过64字符"),
    WE_EXCEPTION_TIP_60123(60123, "未在通讯录找到该部门", "部门不存在通讯录中"),
    WE_EXCEPTION_TIP_60124(60124, "未在通讯录找到父部门", "父部门不存在通讯录中"),
    WE_EXCEPTION_TIP_60125(60125, "部门名字不能为空，且不超过64字符，不包含\\:*?”<>|等特殊字符", "不能为空，且不能超过64字节，且不能含有\\:*?”<>|等字符"),
    WE_EXCEPTION_TIP_60127(60127, "请选择部门", "-"),
    WE_EXCEPTION_TIP_60129(60129, "成员手机和邮箱不能都为空", "成员手机和邮箱至少有个非空"),
    WE_EXCEPTION_TIP_60132(60132, "is_leader_in_dept和department的元素个数不一致", "-"),
    WE_EXCEPTION_TIP_60136(60136, "记录不存在", "-"),
    WE_EXCEPTION_TIP_60137(60137, "家长手机号重复", "同一个家校通讯录中，家长的手机号不能重复。建议更换手机号，或者更新已有的手机记录。"),
    WE_EXCEPTION_TIP_60203(60203, "不合法的模版ID", "-"),
    WE_EXCEPTION_TIP_60204(60204, "模版状态不可用", "-"),
    WE_EXCEPTION_TIP_60205(60205, "模版关键词不匹配", "-"),
    WE_EXCEPTION_TIP_60206(60206, "该种类型的消息只支持第三方独立应用使用", "-"),
    WE_EXCEPTION_TIP_60207(60207, "第三方独立应用只允许发送模板消息", "-"),
    WE_EXCEPTION_TIP_60208(60208, "第三方独立应用不支持指定@all，不支持参数toparty和totag", "-"),
    WE_EXCEPTION_TIP_65000(65000, "学校已经迁移", "-"),
    WE_EXCEPTION_TIP_65001(65001, "无效的关注模式", "-"),
    WE_EXCEPTION_TIP_65002(65002, "导入家长信息数量过多", "批量导入家长每次最多1000个"),
    WE_EXCEPTION_TIP_65003(65003, "学校尚未迁移", "-"),
    WE_EXCEPTION_TIP_65004(65004, "组织架构不存在", "-"),
    WE_EXCEPTION_TIP_65005(65005, "无效的同步模式", "-"),
    WE_EXCEPTION_TIP_65006(65006, "无效的管理员类型", "-"),
    WE_EXCEPTION_TIP_65007(65007, "无效的家校部门类型", "-"),
    WE_EXCEPTION_TIP_65008(65008, "无效的入学年份", "-"),
    WE_EXCEPTION_TIP_65009(65009, "无效的标准年级类型", "-"),
    WE_EXCEPTION_TIP_65010(65010, "此userid并不是学生", "-"),
    WE_EXCEPTION_TIP_65011(65011, "家长userid数量超过限制", "每次最多批量处理100个家长"),
    WE_EXCEPTION_TIP_65012(65012, "学生userid数量超过限制", "每次最多批量处理10个学生"),
    WE_EXCEPTION_TIP_65013(65013, "学生已有家长", "-"),
    WE_EXCEPTION_TIP_65014(65014, "非学校企业", "-"),
    WE_EXCEPTION_TIP_65015(65015, "父部门类型不匹配", "添加学校部门，需满足层级关机，班级需要以年级为父部门"),
    WE_EXCEPTION_TIP_65018(65018, "家长人数达到上限", "未验证的学校企业最多可添加2000名家长，验证过的学校企业最多可添加20000名家长"),
    WE_EXCEPTION_TIP_72023(72023, "发票已被其他公众号锁定", "查看帮助"),
    WE_EXCEPTION_TIP_72024(72024, "发票状态错误", "reimburse_status状态错误，参考：更新发票状态"),
    WE_EXCEPTION_TIP_72037(72037, "存在发票不属于该用户", "只能批量更新该openid的发票，参考：批量更新发票状态"),
    WE_EXCEPTION_TIP_80001(80001, "可信域名不正确，或者无ICP备案", "查看帮助"),
    WE_EXCEPTION_TIP_81001(81001, "部门下的结点数超过限制（3W）", "-"),
    WE_EXCEPTION_TIP_81002(81002, "部门最多15层", "-"),
    WE_EXCEPTION_TIP_81003(81003, "标签下节点个数超过30000个", "-"),
    WE_EXCEPTION_TIP_81011(81011, "无权限操作标签", "查看帮助"),
    WE_EXCEPTION_TIP_81012(81012, "请选择使用范围", "请求没有填写UserID、部门ID、标签ID"),
    WE_EXCEPTION_TIP_81013(81013, "没有操作权限，请检查企业微信管理后台应用的可见范围", "查看帮助"),
    WE_EXCEPTION_TIP_81014(81014, "标签添加成员，单次添加user或party过多", "-"),
    WE_EXCEPTION_TIP_81015(81015, "邮箱域名需要跟企业邮箱域名一致", "-"),
    WE_EXCEPTION_TIP_81016(81016, "logined_userid字段缺失", "-"),
    WE_EXCEPTION_TIP_81017(81017, "items字段大小超过限制（20）", "-"),
    WE_EXCEPTION_TIP_81018(81018, "该服务商可获取名字数量配额不足", "-"),
    WE_EXCEPTION_TIP_81019(81019, "服务异常", "-"),
    WE_EXCEPTION_TIP_81020(81020, "服务异常", "-"),
    WE_EXCEPTION_TIP_81021(81021, "服务异常", "-"),
    WE_EXCEPTION_TIP_82001(82001, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_82002(82002, "每次最多可选择100个部门，请分批操作", "发消息，单次不能超过100个部门"),
    WE_EXCEPTION_TIP_82003(82003, "每次最多可选择100个标签，请分批操作", "发消息，单次不能超过100个标签"),
    WE_EXCEPTION_TIP_84014(84014, "成员票据过期", "查看帮助"),
    WE_EXCEPTION_TIP_84015(84015, "成员票据无效", "确认user_ticket参数来源是否正确。参考接口：根据code获取成员信息"),
    WE_EXCEPTION_TIP_84019(84019, "服务异常", "-"),
    WE_EXCEPTION_TIP_84020(84020, "服务异常", "确认参数是否有带，并且已创建"),
    WE_EXCEPTION_TIP_84021(84021, "服务异常", "-"),
    WE_EXCEPTION_TIP_84022(84022, "服务异常", "-"),
    WE_EXCEPTION_TIP_84023(84023, "服务异常", "-"),
    WE_EXCEPTION_TIP_84024(84024, "无注册信息", "查看帮助"),
    WE_EXCEPTION_TIP_84025(84025, "服务异常", "必须是[a-zA-Z0-9]的参数值，长度不可超过128个字节"),
    WE_EXCEPTION_TIP_84052(84052, "服务异常", "-"),
    WE_EXCEPTION_TIP_84053(84053, "服务异常", "-"),
    WE_EXCEPTION_TIP_84054(84054, "服务异常", "-"),
    WE_EXCEPTION_TIP_84055(84055, "超过拨打公费电话频率，同一客服5s内只能拨打一次", "同一个客服5秒内只能调用api拨打一次公费电话"),
    WE_EXCEPTION_TIP_84056(84056, "被拨打用户安装应用时未授权拨打公费电话权限", "-"),
    WE_EXCEPTION_TIP_84057(84057, "公费电话余额不足", "-"),
    WE_EXCEPTION_TIP_84058(84058, "拨号人 呼叫号码不支持", "-"),
    WE_EXCEPTION_TIP_84059(84059, "号码非法", "-"),
    WE_EXCEPTION_TIP_84060(84060, "被拨号人 呼叫号码不支持", "-"),
    WE_EXCEPTION_TIP_84061(84061, "不存在外部联系人的关系", "-"),
    WE_EXCEPTION_TIP_84062(84062, "未开启公费电话应用", "-"),
    WE_EXCEPTION_TIP_84063(84063, "拨号人不存在", "-"),
    WE_EXCEPTION_TIP_84064(84064, "被拨号人不存在", "-"),
    WE_EXCEPTION_TIP_84065(84065, "拨号人与被拨号者不能为同一个人", "不允许自己拨打给自己"),
    WE_EXCEPTION_TIP_84066(84066, "服务商拨打次数超过限制", "单个企业管理员，在一天（以上午10:00为起始时间）内，对应单个服务商，只能被呼叫【4】次。"),
    WE_EXCEPTION_TIP_84067(84067, "管理员收到的服务商公费电话个数超过限制", "单个企业管理员，在一天（以上午10:00为起始时间）内，一共只能被【3】个服务商成功呼叫。"),
    WE_EXCEPTION_TIP_84069(84069, "拨打方被限制拨打公费电话", "-"),
    WE_EXCEPTION_TIP_84070(84070, "不支持的电话号码", "拨打方或者被拨打方电话号码不支持"),
    WE_EXCEPTION_TIP_84071(84071, "不合法的外部联系人授权码", "非法或者已经消费过"),
    WE_EXCEPTION_TIP_84072(84072, "应用未配置客服", "-"),
    WE_EXCEPTION_TIP_84073(84073, "客服不在应用配置的客服列表中", "-"),
    WE_EXCEPTION_TIP_84074(84074, "成员不在客户联系配置的使用范围内，请在企业微信管理后台 客户联系->配置->配置使用范围添加该成员", "-"),
    WE_EXCEPTION_TIP_84075(84075, "服务异常", "-"),
    WE_EXCEPTION_TIP_84076(84076, "服务异常", "-"),
    WE_EXCEPTION_TIP_84077(84077, "订单价格过高，无法受理", "-"),
    WE_EXCEPTION_TIP_84078(84078, "购买人数不正确", "-"),
    WE_EXCEPTION_TIP_84079(84079, "价格策略不存在", "-"),
    WE_EXCEPTION_TIP_84080(84080, "订单不存在", "-"),
    WE_EXCEPTION_TIP_84081(84081, "存在未支付订单", "-"),
    WE_EXCEPTION_TIP_84082(84082, "存在申请退款中的订单", "-"),
    WE_EXCEPTION_TIP_84083(84083, "非服务人员", "-"),
    WE_EXCEPTION_TIP_84084(84084, "非跟进用户", "-"),
    WE_EXCEPTION_TIP_84085(84085, "应用已下架", "-"),
    WE_EXCEPTION_TIP_84086(84086, "订单人数超过可购买最大人数", "-"),
    WE_EXCEPTION_TIP_84087(84087, "打开订单支付前禁止关闭订单", "-"),
    WE_EXCEPTION_TIP_84088(84088, "禁止关闭已支付的订单", "-"),
    WE_EXCEPTION_TIP_84089(84089, "订单已支付", "-"),
    WE_EXCEPTION_TIP_84090(84090, "服务异常", "-"),
    WE_EXCEPTION_TIP_84091(84091, "订单价格不可低于下限", "-"),
    WE_EXCEPTION_TIP_84092(84092, "无法发起代下单操作", "-"),
    WE_EXCEPTION_TIP_84093(84093, "代理关系已占用，无法代下单", "-"),
    WE_EXCEPTION_TIP_84094(84094, "该应用未配置代理分润规则，请先联系应用服务商处理", "-"),
    WE_EXCEPTION_TIP_84095(84095, "免费试用版，无法扩容", "-"),
    WE_EXCEPTION_TIP_84096(84096, "免费试用版，无法续期", "-"),
    WE_EXCEPTION_TIP_84097(84097, "当前企业有未处理订单", "-"),
    WE_EXCEPTION_TIP_84098(84098, "固定总量，无法扩容", "-"),
    WE_EXCEPTION_TIP_84099(84099, "非购买状态，无法扩容", "-"),
    WE_EXCEPTION_TIP_84100(84100, "未购买过此应用，无法续期", "-"),
    WE_EXCEPTION_TIP_84101(84101, "企业已试用付费版本，无法全新购买", "-"),
    WE_EXCEPTION_TIP_84102(84102, "企业当前应用状态已过期，无法扩容", "-"),
    WE_EXCEPTION_TIP_84103(84103, "仅可修改未支付订单", "-"),
    WE_EXCEPTION_TIP_84104(84104, "订单已支付，无法修改", "-"),
    WE_EXCEPTION_TIP_84105(84105, "订单已被取消，无法修改", "-"),
    WE_EXCEPTION_TIP_84106(84106, "企业含有该应用的待支付订单，无法代下单", "-"),
    WE_EXCEPTION_TIP_84107(84107, "企业含有该应用的退款中订单，无法代下单", "-"),
    WE_EXCEPTION_TIP_84108(84108, "企业含有该应用的待生效订单，无法代下单", "-"),
    WE_EXCEPTION_TIP_84109(84109, "订单定价不能未0", "-"),
    WE_EXCEPTION_TIP_84110(84110, "新安装应用不在试用状态，无法升级为付费版", "-"),
    WE_EXCEPTION_TIP_84111(84111, "无足够可用优惠券", "-"),
    WE_EXCEPTION_TIP_84112(84112, "无法关闭未支付订单", "-"),
    WE_EXCEPTION_TIP_84113(84113, "无付费信息", "-"),
    WE_EXCEPTION_TIP_84114(84114, "虚拟版本不支持下单", "-"),
    WE_EXCEPTION_TIP_84115(84115, "虚拟版本不支持扩容", "-"),
    WE_EXCEPTION_TIP_84116(84116, "虚拟版本不支持续期", "-"),
    WE_EXCEPTION_TIP_84117(84117, "在虚拟正式版期内不能扩容", "-"),
    WE_EXCEPTION_TIP_84118(84118, "虚拟正式版期内不能变更版本", "-"),
    WE_EXCEPTION_TIP_84119(84119, "当前企业未报备，无法进行代下单", "-"),
    WE_EXCEPTION_TIP_84120(84120, "当前应用版本已删除", "-"),
    WE_EXCEPTION_TIP_84121(84121, "应用版本已删除，无法扩容", "-"),
    WE_EXCEPTION_TIP_84122(84122, "应用版本已删除，无法续期", "-"),
    WE_EXCEPTION_TIP_84123(84123, "非虚拟版本，无法升级", "-"),
    WE_EXCEPTION_TIP_84124(84124, "非行业方案订单，不能添加部分应用版本的订单", "-"),
    WE_EXCEPTION_TIP_84125(84125, "购买人数不能少于最少购买人数", "-"),
    WE_EXCEPTION_TIP_84126(84126, "购买人数不能多于最大购买人数", "-"),
    WE_EXCEPTION_TIP_84127(84127, "无应用管理权限", "-"),
    WE_EXCEPTION_TIP_84128(84128, "无该行业方案下全部应用的管理权限", "-"),
    WE_EXCEPTION_TIP_84129(84129, "付费策略已被删除，无法下单", "-"),
    WE_EXCEPTION_TIP_84130(84130, "订单生效时间不合法", "-"),
    WE_EXCEPTION_TIP_84200(84200, "文件转译解析错误", "只支持utf8文件转译，可能是不支持的文件类型或者格式"),
    WE_EXCEPTION_TIP_85002(85002, "包含不合法的词语", "-"),
    WE_EXCEPTION_TIP_85004(85004, "每企业每个月设置的可信域名不可超过20个", "-"),
    WE_EXCEPTION_TIP_85005(85005, "可信域名未通过所有权校验", "查看帮助"),
    WE_EXCEPTION_TIP_86001(86001, "服务异常", "-"),
    WE_EXCEPTION_TIP_86003(86003, "聊天对象不存在", "-"),
    WE_EXCEPTION_TIP_86004(86004, "群名不合法，请重新设置", "-"),
    WE_EXCEPTION_TIP_86005(86005, "服务异常", "-"),
    WE_EXCEPTION_TIP_86006(86006, "群成员数过多或过少", "-"),
    WE_EXCEPTION_TIP_86007(86007, "不合法的群成员", "-"),
    WE_EXCEPTION_TIP_86008(86008, "非法操作非自己创建的群", "-"),
    WE_EXCEPTION_TIP_86101(86101, "仅群主才有操作权限", "-"),
    WE_EXCEPTION_TIP_86201(86201, "请选择群聊", "-"),
    WE_EXCEPTION_TIP_86202(86202, "请填写群名", "-"),
    WE_EXCEPTION_TIP_86203(86203, "服务异常", "-"),
    WE_EXCEPTION_TIP_86204(86204, "请添加群成员", "-"),
    WE_EXCEPTION_TIP_86205(86205, "服务异常", "-"),
    WE_EXCEPTION_TIP_86206(86206, "服务异常", "-"),
    WE_EXCEPTION_TIP_86207(86207, "群主不在群成员列表", "-"),
    WE_EXCEPTION_TIP_86215(86215, "会话ID已经存在", "-"),
    WE_EXCEPTION_TIP_86216(86216, "未找到该成员", "查看帮助"),
    WE_EXCEPTION_TIP_86217(86217, "会话发送者不在会话成员列表中", "会话的发送者，必须是会话的成员列表之一"),
    WE_EXCEPTION_TIP_86220(86220, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_86224(86224, "不是受限群，不允许使用该接口", "-"),
    WE_EXCEPTION_TIP_90001(90001, "未认证摇一摇周边", "-"),
    WE_EXCEPTION_TIP_90002(90002, "服务异常", "-"),
    WE_EXCEPTION_TIP_90003(90003, "服务异常", "-"),
    WE_EXCEPTION_TIP_90100(90100, "非法的对外属性类型", "-"),
    WE_EXCEPTION_TIP_90101(90101, "文本长度不可超过12字符", "文本长度不可超过12个UTF8字符"),
    WE_EXCEPTION_TIP_90102(90102, "链接标题长度不可超过12字符", "标题长度不可超过12个UTF8字符"),
    WE_EXCEPTION_TIP_90103(90103, "URL无法访问", "-"),
    WE_EXCEPTION_TIP_90104(90104, "小程序标题长度不可超过12字符", "标题长度不可超过12个UTF8字符"),
    WE_EXCEPTION_TIP_90105(90105, "小程序访问路径无效", "-"),
    WE_EXCEPTION_TIP_90106(90106, "服务异常", "-"),
    WE_EXCEPTION_TIP_90200(90200, "请填写小程序appid", "-"),
    WE_EXCEPTION_TIP_90201(90201, "小程序通知的content_item不能超过10个", "item个数不能超过10个"),
    WE_EXCEPTION_TIP_90202(90202, "小程序通知中的key不能为空或超过10个汉字", "不能为空或超过10个汉字"),
    WE_EXCEPTION_TIP_90203(90203, "小程序通知中的value长度不能为空或超过30个汉字", "不能为空或超过30个汉字"),
    WE_EXCEPTION_TIP_90204(90204, "服务异常", "-"),
    WE_EXCEPTION_TIP_90206(90206, "小程序未关联到企业中，请在小程序开发后台关联当前企业", "-"),
    WE_EXCEPTION_TIP_90207(90207, "小程序appid无效", "-"),
    WE_EXCEPTION_TIP_90208(90208, "小程序appid不匹配", "-"),
    WE_EXCEPTION_TIP_90300(90300, "服务异常", "-"),
    WE_EXCEPTION_TIP_90302(90302, "付费应用已过期", "-"),
    WE_EXCEPTION_TIP_90303(90303, "付费应用超过最大使用人数", "-"),
    WE_EXCEPTION_TIP_90304(90304, "订单中心服务异常，请稍后重试", "-"),
    WE_EXCEPTION_TIP_90305(90305, "服务异常", "-"),
    WE_EXCEPTION_TIP_90306(90306, "服务异常", "-"),
    WE_EXCEPTION_TIP_90307(90307, "登录态过期", "-"),
    WE_EXCEPTION_TIP_90308(90308, "在开启IP鉴权的前提下，识别为无效的请求IP", "-"),
    WE_EXCEPTION_TIP_90309(90309, "订单已经存在，请勿重复下单", "-"),
    WE_EXCEPTION_TIP_90310(90310, "找不到订单", "-"),
    WE_EXCEPTION_TIP_90311(90311, "关单失败, 可能原因：该单并没被拉起支付页面; 已经关单；已经支付；渠道失败；单处于保护状态；等等", "-"),
    WE_EXCEPTION_TIP_90312(90312, "退款请求失败, 详情请看errmsg", "-"),
    WE_EXCEPTION_TIP_90313(90313, "退款调用频率限制，超过规定的阈值", "-"),
    WE_EXCEPTION_TIP_90314(90314, "订单状态错误，可能未支付，或者当前状态操作受限", "-"),
    WE_EXCEPTION_TIP_90315(90315, "退款请求失败，主键冲突，请核实退款refund_id是否已使用", "-"),
    WE_EXCEPTION_TIP_90316(90316, "退款原因编号不对", "-"),
    WE_EXCEPTION_TIP_90317(90317, "尚未注册成为供应商", "-"),
    WE_EXCEPTION_TIP_90318(90318, "服务异常", "-"),
    WE_EXCEPTION_TIP_90319(90319, "服务异常", "-"),
    WE_EXCEPTION_TIP_90320(90320, "订单token无效", "-"),
    WE_EXCEPTION_TIP_90321(90321, "订单token已过有效时间", "-"),
    WE_EXCEPTION_TIP_90322(90322, "旧套件（包含多个应用的套件）不支持支付系统", "-"),
    WE_EXCEPTION_TIP_90323(90323, "单价超过限额", "-"),
    WE_EXCEPTION_TIP_90324(90324, "商品数量超过限额", "-"),
    WE_EXCEPTION_TIP_90325(90325, "预支单已经存在", "-"),
    WE_EXCEPTION_TIP_90326(90326, "预支单单号非法", "-"),
    WE_EXCEPTION_TIP_90327(90327, "该预支单已经结算下单", "-"),
    WE_EXCEPTION_TIP_90328(90328, "结算下单失败，详情请看errmsg", "-"),
    WE_EXCEPTION_TIP_90329(90329, "该订单号已经被预支单占用", "-"),
    WE_EXCEPTION_TIP_90330(90330, "创建供应商失败", "-"),
    WE_EXCEPTION_TIP_90331(90331, "更新供应商失败", "-"),
    WE_EXCEPTION_TIP_90332(90332, "还没签署合同", "-"),
    WE_EXCEPTION_TIP_90333(90333, "创建合同失败", "-"),
    WE_EXCEPTION_TIP_90338(90338, "已经过了可退款期限", "-"),
    WE_EXCEPTION_TIP_90339(90339, "供应商主体名包含非法字符", "-"),
    WE_EXCEPTION_TIP_90340(90340, "创建客户失败，可能信息真实性校验失败", "-"),
    WE_EXCEPTION_TIP_90341(90341, "退款金额大于付款金额", "-"),
    WE_EXCEPTION_TIP_90342(90342, "退款金额超过账户余额", "-"),
    WE_EXCEPTION_TIP_90343(90343, "退款单号已经存在", "-"),
    WE_EXCEPTION_TIP_90344(90344, "指定的付款渠道无效", "-"),
    WE_EXCEPTION_TIP_90345(90345, "超过5w人民币不可指定微信支付渠道", "-"),
    WE_EXCEPTION_TIP_90346(90346, "同一单的退款次数超过限制", "-"),
    WE_EXCEPTION_TIP_90347(90347, "退款金额不可为0", "-"),
    WE_EXCEPTION_TIP_90348(90348, "管理端没配置支付密钥", "-"),
    WE_EXCEPTION_TIP_90349(90349, "记录数量太大", "-"),
    WE_EXCEPTION_TIP_90350(90350, "银行信息真实性校验失败", "-"),
    WE_EXCEPTION_TIP_90351(90351, "应用状态异常", "-"),
    WE_EXCEPTION_TIP_90352(90352, "延迟试用期天数超过限制", "-"),
    WE_EXCEPTION_TIP_90353(90353, "预支单列表不可为空", "-"),
    WE_EXCEPTION_TIP_90354(90354, "预支单列表数量超过限制", "-"),
    WE_EXCEPTION_TIP_90355(90355, "关联有退款预支单，不可删除", "-"),
    WE_EXCEPTION_TIP_90356(90356, "不能0金额下单", "-"),
    WE_EXCEPTION_TIP_90357(90357, "代下单必须指定支付渠道", "-"),
    WE_EXCEPTION_TIP_90358(90358, "预支单或代下单，不支持部分退款", "-"),
    WE_EXCEPTION_TIP_90359(90359, "预支单与下单者企业不匹配", "-"),
    WE_EXCEPTION_TIP_90456(90456, "必须指定组织者", "-"),
    WE_EXCEPTION_TIP_90457(90457, "日历ID异常", "-"),
    WE_EXCEPTION_TIP_90458(90458, "日历ID列表不能为空", "-"),
    WE_EXCEPTION_TIP_90459(90459, "日历已删除", "-"),
    WE_EXCEPTION_TIP_90460(90460, "日程已删除", "-"),
    WE_EXCEPTION_TIP_90461(90461, "日程ID异常", "-"),
    WE_EXCEPTION_TIP_90462(90462, "日程ID列表不能为空", "-"),
    WE_EXCEPTION_TIP_90463(90463, "不能变更组织者", "-"),
    WE_EXCEPTION_TIP_90464(90464, "参与者数量超过限制", "-"),
    WE_EXCEPTION_TIP_90465(90465, "不支持的重复类型", "-"),
    WE_EXCEPTION_TIP_90466(90466, "不能操作别的应用创建的日历/日程", "-"),
    WE_EXCEPTION_TIP_90467(90467, "星期参数异常", "-"),
    WE_EXCEPTION_TIP_90468(90468, "不能变更组织者", "-"),
    WE_EXCEPTION_TIP_90469(90469, "每页大小超过限制", "-"),
    WE_EXCEPTION_TIP_90470(90470, "页数异常", "-"),
    WE_EXCEPTION_TIP_90471(90471, "提醒时间异常", "-"),
    WE_EXCEPTION_TIP_90472(90472, "没有日历/日程操作权限", "-"),
    WE_EXCEPTION_TIP_90473(90473, "颜色参数异常", "-"),
    WE_EXCEPTION_TIP_90474(90474, "组织者不能与参与者重叠", "-"),
    WE_EXCEPTION_TIP_90475(90475, "不是组织者的日历", "-"),
    WE_EXCEPTION_TIP_90479(90479, "不允许操作用户创建的日程", "-"),
    WE_EXCEPTION_TIP_90500(90500, "群主并未离职", "-"),
    WE_EXCEPTION_TIP_90501(90501, "该群不是客户群", "-"),
    WE_EXCEPTION_TIP_90502(90502, "群主已经离职", "-"),
    WE_EXCEPTION_TIP_90503(90503, "满人 & 99个微信成员，没办法踢，要客户端确认", "-"),
    WE_EXCEPTION_TIP_90504(90504, "群主没变", "-"),
    WE_EXCEPTION_TIP_90507(90507, "离职群正在继承处理中", "-"),
    WE_EXCEPTION_TIP_90508(90508, "离职群已经继承", "-"),
    WE_EXCEPTION_TIP_91040(91040, "服务异常", "查看帮助"),
    WE_EXCEPTION_TIP_92000(92000, "成员不在应用可见范围之内", "-"),
    WE_EXCEPTION_TIP_92001(92001, "应用没有敏感信息权限", "-"),
    WE_EXCEPTION_TIP_92002(92002, "不允许跨企业调用", "-"),
    WE_EXCEPTION_TIP_93000(93000, "机器人webhookurl不合法或者机器人已经被移除出群", "-"),
    WE_EXCEPTION_TIP_93004(93004, "机器人被停用", "-"),
    WE_EXCEPTION_TIP_93008(93008, "不在群里", "-"),
    WE_EXCEPTION_TIP_94000(94000, "应用未开启工作台自定义模式", "请在管理端后台应用详情里面开启自定义工作台模式"),
    WE_EXCEPTION_TIP_94001(94001, "服务异常", "-"),
    WE_EXCEPTION_TIP_94002(94002, "服务异常", "-"),
    WE_EXCEPTION_TIP_94003(94003, "服务异常", "-"),
    WE_EXCEPTION_TIP_94005(94005, "服务异常", "-"),
    WE_EXCEPTION_TIP_94006(94006, "服务异常", "-"),
    WE_EXCEPTION_TIP_94007(94007, "服务异常", "-"),
    WE_EXCEPTION_TIP_94008(94008, "应用未设置自定义工作台模版类型", "-"),
    WE_EXCEPTION_TIP_301002(301002, "无权限操作指定的应用", "查看帮助"),
    WE_EXCEPTION_TIP_301005(301005, "不允许删除创建者", "创建者不允许从通讯录中删除。如果需要删除该成员，需要先在WEB管理端转移创建者身份。"),
    WE_EXCEPTION_TIP_301012(301012, "服务异常", "长度不允许超过128个字符"),
    WE_EXCEPTION_TIP_301013(301013, "服务异常", "telephone必须由1-32位的纯数字或’-‘号组成。"),
    WE_EXCEPTION_TIP_301014(301014, "服务异常", "参数如果有传递，不允许为空字符串，同时不能超过64字节，只能是由字母、数字、点(.)、减号(-)、空格或下划线(_)组成"),
    WE_EXCEPTION_TIP_301015(301015, "服务异常", "请检查 mediaid 来源，应该通过上传临时素材的图片类型获得mediaid"),
    WE_EXCEPTION_TIP_301016(301016, "上传语音文件不符合系统要求", "语音文件的系统限制，参考上传的媒体文件限制"),
    WE_EXCEPTION_TIP_301017(301017, "上传语音文件仅支持AMR格式", "语音文件的系统限制，参考上传的媒体文件限制"),
    WE_EXCEPTION_TIP_301021(301021, "未在通讯录下找到部分成员", "至少有一个userid不存在于通讯录中"),
    WE_EXCEPTION_TIP_301022(301022, "获取打卡数据失败", "系统失败，可重试处理"),
    WE_EXCEPTION_TIP_301023(301023, "每次最多可选择100个，请分批操作", "列表数量不能为0且不超过100"),
    WE_EXCEPTION_TIP_301024(301024, "获取打卡记录时间间隔超限", "保证开始时间大于0 且结束时间大于 0 且结束时间大于开始时间，且间隔少于一个月"),
    WE_EXCEPTION_TIP_301025(301025, "服务异常", "请参考参数说明正确填写"),
    WE_EXCEPTION_TIP_301036(301036, "不允许更新该用户的userid", "查看帮助"),
    WE_EXCEPTION_TIP_302003(302003, "有成员重复，请重新操作", "-"),
    WE_EXCEPTION_TIP_302004(302004, "组织架构不合法（1不是一棵树，2 多个一样的partyid，3 partyid空，4 partyid name 空，5 同一个父节点下有两个子节点 部门名字一样 可能是以上情况，请一一排查）", "-"),
    WE_EXCEPTION_TIP_302005(302005, "批量导入系统失败，请重新尝试导入", "-"),
    WE_EXCEPTION_TIP_302006(302006, "批量导入任务的文件中partyid有重复", "-"),
    WE_EXCEPTION_TIP_302007(302007, "批量导入任务的文件中，同一个部门下有两个子部门名字一样", "-"),
    WE_EXCEPTION_TIP_2000002(2000002, "应用不存在", "指定的CorpId不存在"),
    WE_EXCEPTION_TIP_600001(600001, "不合法的sn", "sn可能尚未进行登记"),
    WE_EXCEPTION_TIP_600002(600002, "设备已注册", "可能设备已经建立过长连接"),
    WE_EXCEPTION_TIP_600003(600003, "不合法的硬件activecode", "-"),
    WE_EXCEPTION_TIP_600004(600004, "该硬件尚未授权任何企业", "-"),
    WE_EXCEPTION_TIP_600005(600005, "硬件Secret无效", "-"),
    WE_EXCEPTION_TIP_600007(600007, "服务异常", "-"),
    WE_EXCEPTION_TIP_600008(600008, "服务异常", "-"),
    WE_EXCEPTION_TIP_600009(600009, "服务异常", "-"),
    WE_EXCEPTION_TIP_600010(600010, "服务异常", "-"),
    WE_EXCEPTION_TIP_600011(600011, "签名校验失败", "-"),
    WE_EXCEPTION_TIP_600012(600012, "长连接已经注册过设备", "-"),
    WE_EXCEPTION_TIP_600013(600013, "缺少activecode参数", "-"),
    WE_EXCEPTION_TIP_600014(600014, "设备未网络注册", "-"),
    WE_EXCEPTION_TIP_600015(600015, "服务异常", "-"),
    WE_EXCEPTION_TIP_600016(600016, "设备未激活", "-"),
    WE_EXCEPTION_TIP_600018(600018, "无效的起始结束时间", "-"),
    WE_EXCEPTION_TIP_600020(600020, "设备未登录", "-"),
    WE_EXCEPTION_TIP_600021(600021, "设备sn已存在", "-"),
    WE_EXCEPTION_TIP_600023(600023, "时间戳已失效", "-"),
    WE_EXCEPTION_TIP_600024(600024, "固件大小超过5M", "-"),
    WE_EXCEPTION_TIP_600025(600025, "固件名为空或者超过20字节", "-"),
    WE_EXCEPTION_TIP_600026(600026, "固件信息不存在", "-"),
    WE_EXCEPTION_TIP_600027(600027, "服务异常", "-"),
    WE_EXCEPTION_TIP_600028(600028, "固件版本已存在", "-"),
    WE_EXCEPTION_TIP_600029(600029, "非法的固件版本", "-"),
    WE_EXCEPTION_TIP_600030(600030, "服务异常", "-"),
    WE_EXCEPTION_TIP_600031(600031, "硬件固件不允许升级", "-"),
    WE_EXCEPTION_TIP_600032(600032, "无法解析硬件二维码", "-"),
    WE_EXCEPTION_TIP_600033(600033, "设备型号id冲突", "-"),
    WE_EXCEPTION_TIP_600034(600034, "指纹数据大小超过限制", "-"),
    WE_EXCEPTION_TIP_600035(600035, "人脸数据大小超过限制", "-"),
    WE_EXCEPTION_TIP_600036(600036, "设备sn冲突", "-"),
    WE_EXCEPTION_TIP_600037(600037, "缺失设备型号id", "-"),
    WE_EXCEPTION_TIP_600038(600038, "设备型号不存在", "-"),
    WE_EXCEPTION_TIP_600039(600039, "不支持的设备类型", "-"),
    WE_EXCEPTION_TIP_600040(600040, "打印任务id不存在", "-"),
    WE_EXCEPTION_TIP_600041(600041, "无效的offset或limit参数值", "-"),
    WE_EXCEPTION_TIP_600042(600042, "无效的设备型号id", "-"),
    WE_EXCEPTION_TIP_600043(600043, "门禁规则未设置", "-"),
    WE_EXCEPTION_TIP_600044(600044, "门禁规则不合法", "-"),
    WE_EXCEPTION_TIP_600045(600045, "设备已订阅企业信息", "-"),
    WE_EXCEPTION_TIP_600046(600046, "操作id和用户userid不匹配", "-"),
    WE_EXCEPTION_TIP_600047(600047, "secretno的status非法", "请确认是否是使用统一初始secretno的设备，如果是无有正确执行换secretno的流程"),
    WE_EXCEPTION_TIP_600048(600048, "无效的指纹算法", "-"),
    WE_EXCEPTION_TIP_600049(600049, "无效的人脸识别算法", "-"),
    WE_EXCEPTION_TIP_600050(600050, "无效的算法长度", "-"),
    WE_EXCEPTION_TIP_600051(600051, "设备过期", "-"),
    WE_EXCEPTION_TIP_600052(600052, "无效的文件分块", "-"),
    WE_EXCEPTION_TIP_600053(600053, "该链接已经激活", "-"),
    WE_EXCEPTION_TIP_600054(600054, "该链接已经订阅", "-"),
    WE_EXCEPTION_TIP_600055(600055, "无效的用户类型", "-"),
    WE_EXCEPTION_TIP_600056(600056, "无效的健康状态", "-"),
    WE_EXCEPTION_TIP_600057(600057, "缺少体温参数", "-"),
    WE_EXCEPTION_TIP_610001(610001, "永久二维码超过每个员工5000的限制", "-"),
    WE_EXCEPTION_TIP_610003(610003, "服务异常", "有效的scene长度为1~64字符，由英文字母、数字、中划线、下划线以及点号构成"),
    WE_EXCEPTION_TIP_610004(610004, "成员不在客户联系配置的使用范围内，请在企业微信管理后台 客户联系->配置->配置使用范围添加该成员", "请在管理端后台 客户联系->配置->配置使用范围配置该用户"),
    WE_EXCEPTION_TIP_640001(640001, "微盘不存在当前空间", "判断spaceid是否填错"),
    WE_EXCEPTION_TIP_640002(640002, "文件不存在", "判断fileid是否填错"),
    WE_EXCEPTION_TIP_640003(640003, "文件已删除", "判断fileid对应的文件是否已经被删除"),
    WE_EXCEPTION_TIP_640004(640004, "无权限访问", "判断当前用户是否有访问"),
    WE_EXCEPTION_TIP_640005(640005, "成员不在空间内", "判断当前成员是否在空间内"),
    WE_EXCEPTION_TIP_640006(640006, "超出当前成员拥有的容量", "判断当前用户的个人容量是否超出了限制"),
    WE_EXCEPTION_TIP_640007(640007, "超出微盘的容量", "在管理端查看微盘的容量是否要满了"),
    WE_EXCEPTION_TIP_640008(640008, "没有空间权限", "判断当前userid是否有空间权限"),
    WE_EXCEPTION_TIP_640009(640009, "非法文件名", "判断file_name字段是否为空"),
    WE_EXCEPTION_TIP_640010(640010, "超出空间的最大成员数", "判断当前空间的成员数是否超过了管理端设置的空间最大成员数"),
    WE_EXCEPTION_TIP_640011(640011, "服务异常", "判断是否的json格式是否有误"),
    WE_EXCEPTION_TIP_640012(640012, "服务异常", "判断userid字段是否设置错误"),
    WE_EXCEPTION_TIP_640013(640013, "服务异常", "判断departmentid字段是否设置错误"),
    WE_EXCEPTION_TIP_640014(640014, "空间没有有效的管理员", "判断当前空间是否没有有效的管理员"),
    WE_EXCEPTION_TIP_640015(640015, "不支持设置预览权限", "文件预览权限只有VIP用户才能设置"),
    WE_EXCEPTION_TIP_640016(640016, "不支持设置文件水印", "文件水印只有VIP用户才能设置"),
    WE_EXCEPTION_TIP_640017(640017, "微盘管理端未开通API 权限", "在微盘管理端进行打开"),
    WE_EXCEPTION_TIP_640018(640018, "微盘管理端未设置编辑权限", "在微盘管理端进行打开编辑权限"),
    WE_EXCEPTION_TIP_640019(640019, "API 调用次数超出限制", "免费版：1000次/企业/月; 付费版：100,000次/企业/月"),
    WE_EXCEPTION_TIP_640020(640020, "非法的权限类型", "普通文件：可下载、仅预览; 微文档：可编辑、仅浏览"),
    WE_EXCEPTION_TIP_640021(640021, "服务异常", "fatherid应该为：文件所在的目录fileid, 在根目录时为fileid（判断当前字段是否为空）"),
    WE_EXCEPTION_TIP_640022(640022, "服务异常", "文件内容base64，判断本字段是否为空"),
    WE_EXCEPTION_TIP_640023(640023, "服务异常", "auth_scope应该为三个中的其中一个：1:指定人 2:企业内 3:企业外"),
    WE_EXCEPTION_TIP_640024(640024, "服务异常", "判断fileid字段是否为空"),
    WE_EXCEPTION_TIP_640025(640025, "服务异常", "判断space_name字段是否空"),
    WE_EXCEPTION_TIP_640026(640026, "服务异常", "判断spaceid字段是否空"),
    WE_EXCEPTION_TIP_640027(640027, "服务异常", "判断输入的参数是否有误"),
    WE_EXCEPTION_TIP_640028(640028, "空间设置了关闭成员邀请链接", "查看空间的安全设置的成员邀请链接按钮是否处于关闭状态"),
    WE_EXCEPTION_TIP_640029(640029, "只支持下载普通文件，不支持下载文件夹等其他非文件实体类型", "检查fileid对应的文件是否为普通文件"),;;

    private Integer code;

    private String tipMsg;

    private String solveTipMsg;

    WeExceptionTip(Integer code, String tipMsg, String solveTipMsg) {
        this.code = code;
        this.tipMsg = tipMsg;
        this.solveTipMsg = solveTipMsg;
    }

    public Integer getCode() {
        return code;
    }

    public String getTipMsg() {
        return tipMsg;
    }

    public String getSolveTipMsg() {
        return solveTipMsg;
    }

    public static String getTipMsg(Integer code) {
        WeExceptionTip[] values = WeExceptionTip.values();

        for (WeExceptionTip weExceptionTip : values) {
            if (weExceptionTip.getCode().equals(code)) {
                return weExceptionTip.getTipMsg();
            }
        }
        throw new RuntimeException("企业微信端位置错误类型,请联系管理员工");
    }

    /**
     * 根据对应code查找枚举所有类型，如果没有就返回自定义错误描述
     * @param code  错误码
     * @param msg   错误描述
     * @return
     */
    public static String getTipMsg(Integer code, String msg) {
        WeExceptionTip[] values = WeExceptionTip.values();

        for (WeExceptionTip weExceptionTip : values) {
            if (weExceptionTip.getCode().equals(code)) {
                return weExceptionTip.getTipMsg();
            }
        }
        return msg;
    }
}
