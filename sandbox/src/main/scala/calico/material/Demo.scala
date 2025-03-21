/*
 * Copyright 2023 Arman Bilge
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package calico
package material
import cats.effect.IO
import calico.html.io.{*, given}
import calico.material.io.{*, given}

object Demo extends IOWebApp:
  def render = div(
  label(
    "Material 3",
    mdCheckbox { cb =>
      cb.checked := true
    },
  ),
  label(
    "Select Option",
    mdRadio { r =>  // Pass IO explicitly
      r.checked := true
    },
  ),
  label(
    "Enter Text",
    TextField.mdTextField[IO] { tf =>  // Pass IO explicitly
      tf.value := "Hello"
    },
  ),
  mdOutlinedButton { b =>
    "Back"
  },
  mdFilledButton { b =>
    "Next"
  }
)

