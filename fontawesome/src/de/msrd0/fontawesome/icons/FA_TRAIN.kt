/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Train */
object FA_TRAIN: Icon {
	
	override val name get() = "Train"
	
	override val unicode get() = "f238"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M352 0C405 0 448 42.98 448 96V352C448 399.1 412.8 439.7 366.9 446.9L412.9 492.9C419.9 499.9 414.9 512 404.1 512H365.3C356.8 512 348.6 508.6 342.6 502.6L288 448H160L105.4 502.6C99.37 508.6 91.23 512 82.75 512H43.04C33.06 512 28.06 499.9 35.12 492.9L81.14 446.9C35.18 439.7 0 399.1 0 352V96C0 42.98 42.98 0 96 0H352zM64 192C64 209.7 78.33 224 96 224H352C369.7 224 384 209.7 384 192V96C384 78.33 369.7 64 352 64H96C78.33 64 64 78.33 64 96V192zM224 384C250.5 384 272 362.5 272 336C272 309.5 250.5 288 224 288C197.5 288 176 309.5 176 336C176 362.5 197.5 384 224 384z"/></svg>"""
		else -> null
	}
	
}
