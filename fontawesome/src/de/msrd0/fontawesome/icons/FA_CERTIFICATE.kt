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

object FA_CERTIFICATE: Icon {
	
	override val name get() = "certificate"
	
	override val unicode get() = "f0a3"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 53.46L300.1 7.261C307 1.034 315.1-1.431 324.4 .8185C332.8 3.068 339.3 9.679 341.4 18.1L357.3 80.6L419.3 63.07C427.7 60.71 436.7 63.05 442.8 69.19C448.1 75.34 451.3 84.33 448.9 92.69L431.4 154.7L493.9 170.6C502.3 172.7 508.9 179.2 511.2 187.6C513.4 196 510.1 204.1 504.7 211L458.5 256L504.7 300.1C510.1 307 513.4 315.1 511.2 324.4C508.9 332.8 502.3 339.3 493.9 341.4L431.4 357.3L448.9 419.3C451.3 427.7 448.1 436.7 442.8 442.8C436.7 448.1 427.7 451.3 419.3 448.9L357.3 431.4L341.4 493.9C339.3 502.3 332.8 508.9 324.4 511.2C315.1 513.4 307 510.1 300.1 504.7L256 458.5L211 504.7C204.1 510.1 196 513.4 187.6 511.2C179.2 508.9 172.7 502.3 170.6 493.9L154.7 431.4L92.69 448.9C84.33 451.3 75.34 448.1 69.19 442.8C63.05 436.7 60.71 427.7 63.07 419.3L80.6 357.3L18.1 341.4C9.679 339.3 3.068 332.8 .8186 324.4C-1.431 315.1 1.034 307 7.261 300.1L53.46 256L7.261 211C1.034 204.1-1.431 196 .8186 187.6C3.068 179.2 9.679 172.7 18.1 170.6L80.6 154.7L63.07 92.69C60.71 84.33 63.05 75.34 69.19 69.19C75.34 63.05 84.33 60.71 92.69 63.07L154.7 80.6L170.6 18.1C172.7 9.679 179.2 3.068 187.6 .8185C196-1.431 204.1 1.034 211 7.261L256 53.46z"/></svg>"""
		else -> null
	}
	
}
