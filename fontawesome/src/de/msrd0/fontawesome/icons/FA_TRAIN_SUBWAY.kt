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

/** Train subway */
object FA_TRAIN_SUBWAY: Icon {
	
	override val name get() = "Train subway"
	
	override val unicode get() = "f239"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M352 0C405 0 448 42.98 448 96V352C448 399.1 412.8 439.7 366.9 446.9L412.9 492.9C419.9 499.9 414.9 512 404.1 512H365.3C356.8 512 348.6 508.6 342.6 502.6L288 448H160L105.4 502.6C99.37 508.6 91.23 512 82.75 512H43.04C33.06 512 28.06 499.9 35.12 492.9L81.14 446.9C35.18 439.7 0 399.1 0 352V96C0 42.98 42.98 0 96 0H352zM64 224C64 241.7 78.33 256 96 256H176C193.7 256 208 241.7 208 224V128C208 110.3 193.7 96 176 96H96C78.33 96 64 110.3 64 128V224zM272 96C254.3 96 240 110.3 240 128V224C240 241.7 254.3 256 272 256H352C369.7 256 384 241.7 384 224V128C384 110.3 369.7 96 352 96H272zM96 320C78.33 320 64 334.3 64 352C64 369.7 78.33 384 96 384C113.7 384 128 369.7 128 352C128 334.3 113.7 320 96 320zM352 384C369.7 384 384 369.7 384 352C384 334.3 369.7 320 352 320C334.3 320 320 334.3 320 352C320 369.7 334.3 384 352 384z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TRAIN_SUBWAY]. */
val FA_SUBWAY = FA_TRAIN_SUBWAY
